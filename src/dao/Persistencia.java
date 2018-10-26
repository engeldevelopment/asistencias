
package dao;

import hibernate.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import nicon.notify.core.*;
import org.hibernate.*;
import org.hibernate.criterion.*;


public class Persistencia<T> {
    private Session sesion;
    private Class<T> entidad = getDomainClass();
    
    public Persistencia() {
    }

    public Persistencia(Session sesion) {
        this.sesion = sesion;
    }
    
     protected Class getDomainClass() {
        if (entidad == null) {
            ParameterizedType thisType = (ParameterizedType) getClass()
              .getGenericSuperclass();
            entidad = (Class) thisType.getActualTypeArguments()[0];
        }
        return entidad;
    }
    
    public void guardar(T t){
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.saveOrUpdate(t);
            sesion.getTransaction().commit();
        } catch (HibernateException e) {
             Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
    }
    
    public void actualizar(T t){
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(t);
            sesion.getTransaction().commit();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
    }
    
   
    public void eliminar(T t){
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(t);
            sesion.getTransaction().commit();
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
    }
    
    
    public Collection<T> buscarTodos(){
        List<T> lista = new ArrayList();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Criteria criterio = sesion.createCriteria(entidad);
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

    
    public T buscar(Object id) {
        T t = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Criteria criterio = sesion.createCriteria(entidad);
            criterio.add(Restrictions.eq("id", id));
            t = (T) criterio.list().get(0);
        } catch (HibernateException e) {
            Notification.windowMessage(null, "Disculpe!", "Ha ocurrido un Error:"
                    +e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return t;
    }
}