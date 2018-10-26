
package controlador;

import excepciones.CamposVaciosException;
import dao.*;
import excepciones.*;
import java.awt.event.*;
import java.util.List;
import java.util.Objects;
import modelo.*;
import nicon.notify.core.*;
import presenter.*;
import vista.Menu;

public class EmpleadosController extends Controlador {

    private Menu vista;
    private ManejadorDeEventos manejador;
    private EmpleadoDAO servicioEmpleado;
    private Empleado empleado;
    private ValidacionDeTexto validacion;
    private DepartamentoDAO servicioDepartamento;
    private Departamento departamento;
    private DepartamentoPresenter dptoPresenter;
    private EmpleadoPresenter empleadoPresenter;
    private ValidacionDeTexto texto;
    private String nombre;
    private String apellido;
    private Cedula cedula; 
            
    public EmpleadosController(Menu vista) {
        this.vista = vista;
    }
    
    @Override
    protected void instancias() {
         manejador = new ManejadorDeEventos();
         servicioEmpleado = new EmpleadoDAO();
         validacion = new ValidacionDeTexto();
         servicioDepartamento = new DepartamentoDAO();
         dptoPresenter = new DepartamentoPresenter(vista);
         empleadoPresenter = new EmpleadoPresenter(vista);
         texto = new ValidacionDeTexto();
    }

    @Override
    protected void cargarInformacionDeLaBDs() {
        listarDepartamentos();
    }

    @Override
    protected void boton() {
        vista.btnBuscarEmpleado.addActionListener(manejador);
        vista.btnAgregarDepartamento.addActionListener(manejador);
        vista.btnAsignarDepartamento.addActionListener(manejador);
        vista.NuevoEmpleado.addWindowListener(manejador);
        vista.btnGuardarEmpleado.addActionListener(manejador);
        vista.cmbFiltrarPorDepartamento.addActionListener(manejador);
        vista.btnEditarEmpleado.addActionListener(manejador);
    }

    @Override
    protected void item() {
        vista.itemEmpleadosConsulta.addActionListener(manejador);
        vista.barraEmpleados.addActionListener(manejador);
    }
    
    @Override
    protected void campo() {
        vista.txtCedulaEmpleadoBuscar.addKeyListener(manejador);
        vista.txtEmpleadoABuscar.addKeyListener(manejador);
    }
    
    private void listarDepartamentos() {
        List listado = (List<Departamento>) 
                servicioDepartamento.buscarTodos();
        
        dptoPresenter.ver(listado);
        enComboxDelListadoDeEmpleado(listado);
    }
    
    private void enComboxDelListadoDeEmpleado(List<Departamento> listado) {
        vista.cmbFiltrarPorDepartamento.removeAllItems();
        for (Departamento d: listado) {
            vista.cmbFiltrarPorDepartamento.addItem(d.getNombre());
        }
    }

    String ced;
    private void buscarEmpleado() {
       ced = vista.txtCedulaEmpleadoBuscar.getText();
        try {
            cedula = new Cedula(ced);
            buscar();
            verficarExistencia();
        } catch (ContenidoInvalidoException e) {
            Notification.windowMessage(vista, 
                    "Disculpe!", e.getMessage());
        }
    }
    
    private void buscar() {
        empleado = servicioEmpleado.buscarPorCedula(cedula.get());
    }
    
    boolean vaAGuardar = true;
    private void verficarExistencia() {
        if (empleado.esNull()) {
            int deseaRegistrarlo = Notification.windowConfirmMessage(vista, 
                    "Disculpe!", 
                    "Este empleado no existe. ¿Desea registrarlo?");
            if (deseaRegistrarlo == 1) {
                vaAGuardar = true;
                vista.txtCedula.setText(cedula.get());
                vista.txtCedula.setEditable(false);
                mostrarVentana(vista.NuevoEmpleado, 360, 295);
            }
        } else {
            establecerInformacionDelEmpleadoEnElSubMenu();
            vista.txtCedulaEmpleadoBuscar.setText("");
            mostrarVentana(vista.VistaSubMenu, 700, 500);
        }
    }
    
    private void establecerInformacionDelEmpleadoEnElSubMenu() {
        vista.VistaSubMenu.setTitle("Empleado: "+empleado.getNombre() +" "+empleado.getApellido());
        vista.lblCedulaEmpleado.setText(empleado.getCedula());
        vista.lblNombreEmpleado.setText(empleado.getNombre());
        vista.lblApellidosEmpleado.setText(empleado.getApellido());
        vista.lblDepartamentoEmpleado.setText(empleado.getDepartamento().getNombre());
    }
    
    private void guardarOActualizar() {
        try {
            
            if (vaAGuardar) {
                validarDatosDelEmpleado();
                empleado = new Empleado(cedula.get(), nombre, apellido, departamento);
                servicioEmpleado.guardar(empleado);
                empleadoPresenter.limpiarCampos();

                Notification.windowMessage(vista, 
                        "Listo!", 
                        "Ha sido registrado el empleado exitosamente!",
                        NiconEvent.NOTIFY_OK);
            } else {
                actualizar();
            }    
        } catch (SinDepartamentoAsignadoException | CamposVaciosException | 
                ContenidoInvalidoException ex) {
           
            Notification.windowMessage(vista, 
                    "Disculpe!", 
                    ex.getMessage());
        } 
    }
    
    private void validarDatosDelEmpleado() throws CamposVaciosException, ContenidoInvalidoException {
        obtenerLosDatosDelEmpleado();
        if (texto.estaVacio(nombre) || texto.estaVacio(apellido)) {
            throw new CamposVaciosException("Todos los campos son obligatorios.");
        } else if (!texto.esValido(nombre) || !texto.esValido(apellido)) {
           throw new ContenidoInvalidoException("No se permiten caracteres especiales y/o números en los campos.");
        }
    }
    
    private void obtenerLosDatosDelEmpleado() {
        nombre = vista.txtNombreEmpleado.getText();
        apellido = vista.txtApellidoEmpleado.getText();
    }
    
    Empleado e;
    private void actualizar() {
        try {
            
            cedula = new Cedula(vista.txtCedula.getText());
            e = servicioEmpleado.buscarPorCedula(cedula.get());
            
            if (!e.esNull()) {
                if (esDeOtroEmpleadoLaCedulaAsignada()) {
                    throw new ContenidoInvalidoException("Esta cédula se encuentra asignada a un empleado!");
                }
               
                grabar();
                
            } else {
              
                grabar();
            }
            
        } catch (ContenidoInvalidoException | CamposVaciosException | 
                SinDepartamentoAsignadoException e) {
            
            Notification.windowMessage(vista, 
                        "Disculpe!", 
                        e.getMessage());
        } 
    }
    
    private boolean esDeOtroEmpleadoLaCedulaAsignada() {
        return !Objects.equals(e.getId(), empleado.getId());
    }
    
    private void grabar() throws SinDepartamentoAsignadoException, 
            CamposVaciosException,
            ContenidoInvalidoException {
       
        obtenerLosDatosDelEmpleado();
        validarDatosDelEmpleado();
        
        empleado = new Empleado(e.getId(), cedula.get(), nombre, apellido, departamento);
        servicioEmpleado.actualizar(empleado);
        actualizarVistaDeEmpleados();
        Notification.windowMessage(vista, 
                            "Listo!", 
                            "Se han guardado los cambios exitosamente!",
                            NiconEvent.NOTIFY_OK);
    }
    
    private void actualizarVistaDeEmpleados() {
        vista.lblCedulaEmpleado.setText(empleado.getCedula());
        vista.lblNombreEmpleado.setText(empleado.getNombre());
        vista.lblApellidosEmpleado.setText(empleado.getApellido());
        vista.lblDepartamentoEmpleado.setText(empleado.getDepartamento().getNombre());
        
        vista.VistaSubMenu.setTitle(empleado.getNombre() +" "+empleado.getApellido());
        vista.txtCedula.setEditable(false);
        vista.NuevoEmpleado.dispose();
    }
    
   long idDepartamento = 0; 
   private void asignarDepartamento() {
        if (noSeleccionoUnDepartamento()) {
            Notification.windowMessage(vista, 
                    "Disculpe!", 
                    "Debe seleccionar el departamento para asignarlo al empleado.");
        } else {
            idDepartamento = Integer.parseInt(vista.listadoDeDepartamentos.getValueAt(fila, 0).toString());
            departamento = servicioDepartamento.buscar(idDepartamento);
            vista.txtDepartamentoAsignado.setText(departamento.getNombre());
            vista.VistaSeleccionarDepartamento.dispose();
        }
    }
    
    int fila = 0;
    private boolean noSeleccionoUnDepartamento() {
        fila = vista.listadoDeDepartamentos.getSelectedRow();
        return fila == -1;
    }
    
    private void listarEmpleados() {
        List<Empleado> listado = (List<Empleado>) servicioEmpleado.buscarTodos();
        empleadoPresenter.ver(listado);
        mostrarVentana(vista.Empleados, 660, 303);
    }
    
    private void buscarEmpleadoPorDepartamentoYCedula() {
        List<Empleado> listado = (List<Empleado>) 
                servicioEmpleado.buscarEmpleadoPor(vista.txtEmpleadoABuscar.getText(), 
                        vista.cmbFiltrarPorDepartamento.getSelectedItem().toString());
        empleadoPresenter.ver(listado);
    }
    
    private void editar() {
        enviarDatosAlFormulario();
        vaAGuardar = false;
        vista.txtCedula.setEditable(true);
        mostrarVentana(vista.NuevoEmpleado, 360, 295);
    }
    
    private void enviarDatosAlFormulario() {
        departamento =  servicioDepartamento.buscarPorNombre(vista.lblDepartamentoEmpleado.getText());
        empleado = servicioEmpleado.buscarPorCedula(vista.lblCedulaEmpleado.getText());
        
        vista.txtCedula.setText(empleado.getCedula());
        vista.txtNombreEmpleado.setText(empleado.getNombre());
        vista.txtApellidoEmpleado.setText(empleado.getApellido());
        vista.txtDepartamentoAsignado.setText(departamento.getNombre());
    }
    
    
    private class ManejadorDeEventos extends WindowAdapter implements ActionListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object evento = e.getSource();
            
            if(evento.equals(vista.btnBuscarEmpleado)) {
               buscarEmpleado();
               
            } else if (evento.equals(vista.btnAgregarDepartamento)) {
                mostrarVentana(vista.VistaSeleccionarDepartamento, 400, 217);
                
            } else if (evento.equals(vista.btnAsignarDepartamento)) {
                asignarDepartamento();
                
            } else if (evento.equals(vista.btnGuardarEmpleado)) {
                guardarOActualizar();
                
            } else if (evento.equals(vista.itemEmpleadosConsulta) || 
                    evento.equals(vista.barraEmpleados)) {
                listarEmpleados();
                
            } else if (evento.equals(vista.cmbFiltrarPorDepartamento)) {
                buscarEmpleadoPorDepartamentoYCedula();
                
            } else if (evento.equals(vista.btnEditarEmpleado)) {
                editar();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            Object evento = e.getSource();
            
            if (evento.equals(vista.txtCedulaEmpleadoBuscar)) {
                limitarDigitos(e, vista.txtCedulaEmpleadoBuscar, 8);
            }
            
            if (evento.equals(vista.txtEmpleadoABuscar)) {
                limitarDigitos(e, vista.txtEmpleadoABuscar, 8);
                buscarEmpleadoPorDepartamentoYCedula();
            }
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }

        @Override
        public void windowClosing(WindowEvent e) {
            Object evento = e.getSource();
            if (evento.equals(vista.NuevoEmpleado)) {
                empleadoPresenter.limpiarCampos();
            }
        }
    }
}