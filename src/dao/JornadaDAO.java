
package dao;

import modelo.*;
import nicon.notify.core.*;
import org.hibernate.*;
import hibernate.HibernateUtil;

public class JornadaDAO extends Persistencia<Jornada>{
    private Session sesion;

    public JornadaDAO() {
    
    }
    
    public JornadaDAO(Session sesion) {
        this.sesion = sesion;
    }
    
    public Jornada jornadaDeHoy() {
         Jornada jornada = new JornadaDeTrabajo();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query diaDeHoy = 
                    sesion.createQuery("FROM JornadaDeTrabajo as j WHERE j.fecha = current_date");
           if (diaDeHoy.list().isEmpty()) 
               return jornada;
           
           jornada = (JornadaDeTrabajo) diaDeHoy.list().get(0);
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    + e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        }
        return jornada;
    }
}