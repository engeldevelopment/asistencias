package seguridad;

import excepciones.ErrorLoginException;
import dao.IServicioDeUsuario;

public class ServicioDeLogin {
    
    private IServicioDeUsuario servicio;
    private Usuario user;
    
    public ServicioDeLogin(IServicioDeUsuario servicio) {
        this.servicio = servicio;
    }
    
    public Usuario login(String usuario, String clave) throws 
            ErrorLoginException {
         
        user = servicio.buscar(usuario);
        if (user.esNull()) {
            throw new ErrorLoginException("Este usuario no existe!");
        }
        
        if (!clave.equals(user.getClave())) {
            throw new ErrorLoginException("Clave incorrecta!");
        }
        
        return user;
    }
}
