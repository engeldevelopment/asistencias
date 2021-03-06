
package dao;

import modelo.*;
import java.util.*;
import nicon.notify.core.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import hibernate.HibernateUtil;
import org.joda.time.DateTime;

public class AsistenciaDAO extends Persistencia<Asistencia> implements IServicioAsistencia {
    private Session sesion;

    public AsistenciaDAO() {
    
    }
    
    public AsistenciaDAO(Session sesion) {
        this.sesion = sesion;
    }
    
    @Override
    public Collection<Asistencia> asistenciasDelMes(int mes, int year) {
        List<Asistencia> lista = new ArrayList();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query asistenciasDelMesEnCurso = 
                    sesion.createQuery("From Asistencia as a WHERE month(a.dia) = :mes"
                            + " AND year(a.dia) = :year")
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
    public Collection<Asistencia> buscarAsistenciaDelEmpleado(String cedula) {
        List<Asistencia> listado = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query hoy = sesion.createQuery("From Asistencia as a WHERE a.empleado.cedula like '"+cedula+"%'"
                    + " and a.dia = current_date");
              listado = hoy.list();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        }
        return listado;
    }

    @Override
    public Collection<Asistencia> asistenciasDeHoy() {
         List<Asistencia> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query inasistencias = 
                    sesion.createQuery("FROM Asistencia as a WHERE a.dia = current_date");
            lista = inasistencias.list();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    + e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        }
        return lista;
    }

    @Override
    public Collection<Asistencia> asistenciasDelDia(DateTime fecha) {
        Collection<Asistencia> lista = new ArrayList<>();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Criteria criterio = sesion.createCriteria(Asistencia.class);
            criterio.add(Restrictions.eq("dia", fecha));
            criterio.addOrder(Order.asc("id"));
            lista = criterio.list();
            
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