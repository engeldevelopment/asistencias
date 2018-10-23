package empleado;

import excepciones.ErrorLoginException;
import seguridad.*;
import nullObjects.NullUsuario;
import dao.*;
import org.junit.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class LoginTest {
    
    private ServicioDeLogin servicio;
    private IServicioDeUsuario servicioDeUsuario;
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        servicioDeUsuario = mock(UsuarioDAO.class);
        servicio = new ServicioDeLogin(servicioDeUsuario);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = ErrorLoginException.class)
    public void usuarioIncorrecto() throws 
            ErrorLoginException {
        
        when(servicioDeUsuario.buscar("Engel")).thenReturn(new NullUsuario());
        servicio.login("Engel","1234");
    }
    
    @Test(expected = ErrorLoginException.class)
    public void claveDelUsuarioIncorrecta() throws 
            ErrorLoginException {
        
        when(servicioDeUsuario.buscar("Engel")).thenReturn(new Usuario("Engel","123"));
        servicio.login("Engel","1234");
    }
    
    @Test
    public void loginExitoso() throws
            ErrorLoginException {
        
        when(servicioDeUsuario.buscar("Engel")).thenReturn(new Usuario("Engel","1234"));
        Usuario usuario = servicio.login("Engel","1234");
        
        assertFalse(usuario.esNull());
    }
}
