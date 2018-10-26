package dao;

import modelo.Empleado;
import java.util.*;
import nicon.notify.core.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import hibernate.HibernateUtil;
import nullObjects.NullEmpleado;

public class EmpleadoDAO extends Persistencia<Empleado>{

    private Session sesion;
    
    public Empleado buscarPorCedula(String cedula){
        Empleado empleado = new Empleado();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Criteria criterio = sesion.createCriteria(Empleado.class);
            criterio.add(Restrictions.eq("cedula", cedula));
            if (criterio.list().isEmpty())
                return new NullEmpleado();
            empleado = (Empleado) criterio.list().get(0);
        } catch (HibernateException e) {
             Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        
        return empleado;
    }
    
    
    public Collection<Empleado> buscarEmpleadoPor(String cedula, String departamento){
        List<Empleado> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query empleadoPorDepartamento = 
                    sesion.createQuery("From Empleado e Where e.cedula like :cedula "
                            + "and e.departamento.nombre = :departamento")
                    .setParameter("cedula", cedula+"%")
                    .setParameter("departamento", departamento);
            lista = empleadoPorDepartamento.list();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return lista;
    }
}