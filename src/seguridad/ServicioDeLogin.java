package seguridad;

import excepciones.ErrorLoginException;
import dao.UsuarioDAO;

public class ServicioDeLogin {
    
    private UsuarioDAO servicio;
    private Usuario user;
    
    public ServicioDeLogin(UsuarioDAO servicio) {
        this.servicio = servicio;
    }
    
    public Usuario login(String usuario, String clave) throws 
            ErrorLoginException {
         
        user = servicio.buscarPorNombre(usuario);
        if (user.esNull()) {
            throw new ErrorLoginException("Este usuario no existe!");
        }
        
        if (!clave.equals(user.getClave())) {
            throw new ErrorLoginException("Clave incorrecta!");
        }
        
        return user;
    }
}
