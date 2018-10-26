package dao;

import seguridad.Usuario;
import nullObjects.NullUsuario;
import nicon.notify.core.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import hibernate.HibernateUtil;

public class UsuarioDAO extends Persistencia<Usuario> implements IServicioDeUsuario {
    private Session sesion;

    public UsuarioDAO(Session sesion) {
        this.sesion = sesion;
    }
    
    public UsuarioDAO() {
        
    }

    @Override
    public Usuario buscarPorNombre(Object nombre) {
        Usuario usuario = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Criteria criterio = sesion.createCriteria(Usuario.class);
            criterio.add(Restrictions.eq("nombre", nombre));
            if (criterio.list().isEmpty())
                return new NullUsuario();
            usuario = (Usuario) criterio.list().get(0);
        } catch (HibernateException e) {
            Notification.windowMessage(null, 
                    "Disculpe!", 
                    "Ocurrió un error "+e.getMessage(), 
                    NiconEvent.NOTIFY_ERROR);
        } finally {
            sesion.close();
        }
        return usuario;
    }
}