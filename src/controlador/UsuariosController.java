
package controlador;

import seguridad.*;
import excepciones.ErrorLoginException;
import vista.Menu;
import dao.*;
import java.awt.event.*;
import javax.swing.JFrame;
import nicon.notify.core.*;

public class UsuariosController extends Controlador {
    
    private UsuarioDAO servicio;
    private ServicioDeLogin acceso;
    private ManejadorDeEventos manejador;
    private Menu vista;
    private Usuario usuario;
    
    
    public UsuariosController(Menu vista){
        this.vista = vista;
    }
    
    @Override
    protected void instancias() {
        servicio = new UsuarioDAO();
        acceso = new ServicioDeLogin(servicio);
        manejador = new ManejadorDeEventos();
    }
    
    
    @Override
    protected void cargarInformacionDeLaBDs() {
        servicio.buscarTodos();
    }
    
    @Override
    protected void boton(){
        vista.btnEntrar.addActionListener(manejador);
        vista.Login.addWindowListener(manejador);
    }
    
    private void entrar() {
        try {
            
            String nombre = vista.txtNombreDeUsuario.getText();
            String clave = vista.txtClave.getText();
            
            verificarDatosIngresadosPorElUsuario(nombre, clave);
            
            usuario = acceso.login(nombre, clave);
            vista.Login.dispose();
            vistaMenu();
        
            } catch (ErrorLoginException e) {
                Notification.windowMessage(vista, 
                    "Disculpe!", 
                    e.getMessage(), 
                    NiconEvent.NOTIFY_WARNING);
            } 
    }
    
    private void verificarDatosIngresadosPorElUsuario(String nombre, String clave) throws ErrorLoginException {
        if (nombre.isEmpty() || clave.isEmpty()) {
                throw new ErrorLoginException("Todos los campos son obligatorios!");
        }
        
        if ((nombre.startsWith(" ") && nombre.endsWith(" ")) || 
                (clave.startsWith(" ") && clave.endsWith(" "))) {
                  throw new ErrorLoginException("Todos los campos son obligatorios!");
        }
    }
    
    private void vistaMenu() {
        vista.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vista.setResizable(false);
        vista.setVisible(true);
    }
    
    public void vistaLogin() {
        mostrarVentana(vista.Login, 320, 245);
    }
    
    private class ManejadorDeEventos extends WindowAdapter implements ActionListener  {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object evento = e.getSource();
            if (evento.equals(vista.btnEntrar)) {
                entrar();
            }
        }

        @Override
        public void windowClosing(WindowEvent e) {
            Object evento = e.getSource();
            if (evento.equals(vista.Login)){
                confirmar();
            }
        }
        
        private void confirmar() {
            int respuesta = Notification.windowConfirmMessage(vista, 
                    "Salir?", 
                    "¿Quiere salir del sistema?");
                    if (respuesta == 1) {
                        System.exit(0);
                    }
        }
    }
}
