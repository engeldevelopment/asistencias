
package dao;

import modelo.Inasistencia;
import java.util.*;
import nicon.notify.core.*;
import org.hibernate.*;
import hibernate.HibernateUtil;
import org.joda.time.DateTime;

public class InasistenciaDAO extends Persistencia<Inasistencia> implements IServicioInasistencia {
    private Session sesion;

    public InasistenciaDAO(Session sesion) {
        this.sesion = sesion;
    }

    public InasistenciaDAO() {
       
    }

    @Override
    public Collection<Inasistencia> inasistenciasDeHoy() {
        List<Inasistencia> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query inasistencias = 
                    sesion.createQuery("FROM Inasistencia as i WHERE i.dia = current_date");
            lista = inasistencias.list();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    + e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        }
        return lista;
    }

    @Override
    public Collection<Inasistencia> inasistenciasDurante(DateTime inicio, DateTime fin) {
        List<Inasistencia> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query inasistencias = 
                    sesion.createQuery("From Inasistencia as i Where i.dia between :inicio and :fin order by i.dia asc")
                            .setParameter("inicio", inicio)
                            .setParameter("fin", fin);
            lista = inasistencias.list();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    + e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return lista;
    }

    @Override
    public Collection<Inasistencia> inasistenciasMensualDelEmpleado(String cedula, int mes, int year) {
         List<Inasistencia> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query asistenciasDelMesEnCurso = 
                    sesion.createQuery("From Inasistencia as i WHERE i.empleado.cedula = :cedula AND month(i.dia) = :mes"
                            + " AND year(i.dia) = :year")
                            .setParameter("cedula", cedula)
                            .setParameter("mes", mes)
                            .setParameter("year", year);                
            lista = asistenciasDelMesEnCurso.list();
            
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return lista;
    }

    @Override
    public Collection<Inasistencia> inasistenciasDeEmpleadoDurante(String cedula, 
            DateTime inicio, DateTime fin) {
        
        List<Inasistencia> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query inasistencias = 
                    sesion.createQuery("FROM Inasistencia as i WHERE i.dia between :inicio and :fin "
                            + "and i.empleado.cedula = :cedula ORDER BY i.dia asc")
                            .setParameter("inicio", inicio)
                            .setParameter("fin", fin)
                            .setParameter("cedula", cedula);
            
            lista = inasistencias.list();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    + e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return lista;
    }
}