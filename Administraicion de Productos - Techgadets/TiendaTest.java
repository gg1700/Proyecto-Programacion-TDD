import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class TiendaTest{
    Producto productoMocked = mock(Producto.class);
    
    @Test
    public void testLongitudDeNombreDeProductoMayorIgualTres(){
        when(productoMocked.getNombre()).thenReturn("Impresora termica directa ZD410");
        //Producto producto = new Producto("Impresora termica directa ZD410");
        //String nombre = producto.getNombre();
        
        //int longitud = nombre.length();
        int longitud = productoMocked.getNombre().length();
        
        assertTrue(longitud >= 3 && longitud <= 100);
    }
    
    @Test
    public void testLongitudDeNombreDeProductoMenorTres(){
        when(productoMocked.getNombre()).thenReturn("El");
        //Producto producto = new Producto("El");
        //String nombre = producto.getNombre();
        
        //int longitud = nombre.length();
        int longitud = productoMocked.getNombre().length();
        
        assertFalse(longitud >= 3 && longitud <= 100);
    }
    
    @Test
    public void testLongitudDeNombreDeProductoMayorCien(){
        String cadena = "6G@kqLN]3BzvgaV2Shy*c7]8;,V})$iECN.vgGV/kA5QjJg5ymCFjbSMR[SXWGaDCcNcEh${+j[HJvHm0%yQKJ:651y8K=Lvpe!nb6w{{";
        when(productoMocked.getNombre()).thenReturn(cadena);
        //Producto producto = new Producto(cadena);
        //String nombre = producto.getNombre();
        
        //int longitud = nombre.length();
        int longitud = productoMocked.getNombre().length();
        
        assertFalse(longitud >= 3 && longitud <= 100);
    }
}