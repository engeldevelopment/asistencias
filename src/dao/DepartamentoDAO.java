
package dao;

import modelo.Departamento;
import nicon.notify.core.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import hibernate.HibernateUtil;


public class DepartamentoDAO extends Persistencia<Departamento>{
    
    private Session sesion;

    public DepartamentoDAO() {
    }
    
    public DepartamentoDAO(Session sesion) {
        this.sesion = sesion;
    }
    
    public Departamento buscarPorNombre(Object dpto){
        Departamento departamento = new Departamento();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Criteria criterio = sesion.createCriteria(Departamento.class);
            criterio.add(Restrictions.eq("nombre", dpto));
            departamento = (Departamento) criterio.list().get(0);
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return departamento;
    }
}