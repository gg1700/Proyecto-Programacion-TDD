import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest{
    @Test
    public void testLongitudDeNombreDeProducto(){
        Producto producto = new Producto("1");
        String nombre = producto.getNombre();
        
        int longitud = nombre.length();
        
        assertTrue(longitud >= 3 && longitud <= 100);
    }
}