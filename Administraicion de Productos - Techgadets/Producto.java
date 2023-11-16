public class Producto{
    private String nombre;
    
    public Producto(String nombre){
        this.nombre = nombre;
        //validarNombre(nombre);
    }
    
    public String getNombre(){
        return nombre;
    }
}