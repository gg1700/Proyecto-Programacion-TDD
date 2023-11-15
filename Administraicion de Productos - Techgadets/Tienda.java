public class Tienda{
    private Inventario inventario;
    
    public Tienda(){
        inventario = new Inventario();
    }
    
    public Inventario getInventario(){
        return inventario;
    }
}
