import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest{
    @Test
    public void testLongitudDeNombreDeProductoMayorIgualTres(){
        Producto producto = new Producto("Impresora termica directa ZD410");
        String nombre = producto.getNombre();
        
        int longitud = nombre.length();
        
        assertTrue(longitud >= 3 && longitud <= 100);
    }
    
    @Test
    public void testLongitudDeNombreDeProductoMenorTres(){
        Producto producto = new Producto("El");
        String nombre = producto.getNombre();
        
        int longitud = nombre.length();
        
        assertFalse(longitud >= 3 && longitud <= 100);
    }
    
    @Test
    public void testLongitudDeNombreDeProductoMayorCien(){
        String cadena = "6G@kqLN]3BzvgaV2Shy*c7]8;,V})$iECN.vgGV/kA5QjJg5ymCFjbSMR[SXWGaDCcNcEh${+j[HJvHm0%yQKJ:651y8K=Lvpe!nb6w{{";
        Producto producto = new Producto(cadena);
        String nombre = producto.getNombre();
        
        int longitud = nombre.length();
        
        assertFalse(longitud >= 3 && longitud <= 100);
    }
}