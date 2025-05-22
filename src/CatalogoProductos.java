import java.util.ArrayList;
import java.util.List;

// Clase que representa un catálogo de productos
public class CatalogoProductos {
    // Lista que almacena los productos del catálogo
    private List<Producto> productos;

    // Constructor que inicializa la lista con productos predeterminados
    public CatalogoProductos() {
        productos = new ArrayList<>();

        // Se agregan productos al catálogo con su nombre, categoría, precio y stock
        productos.add(new Producto("FocusMax", "concentración", 12.5, 20));
        productos.add(new Producto("EnergyRush", "energía", 10.0, 15));
        productos.add(new Producto("SleepEase", "relajación", 8.75, 10));
        productos.add(new Producto("HydraBoost", "hidratación", 6.99, 25));
        productos.add(new Producto("GamerFuel", "energía", 9.5, 30));
        productos.add(new Producto("NeuroShot", "concentración", 11.2, 12));
    }

    // Método que retorna una lista de productos que pertenecen a una categoría específica
    public List<Producto> getProductosPorCategoria(String categoria) {
        List<Producto> recomendados = new ArrayList<>();
        
        // Se recorre la lista de productos y se comparan las categorías (ignorando mayúsculas/minúsculas)
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                recomendados.add(p); // Si la categoría coincide, se agrega a la lista de recomendados
            }
        }
        return recomendados; // Se retorna la lista de productos filtrados por categoría
    }

    // Método que retorna todos los productos del catálogo
    public List<Producto> getTodos() {
        return productos;
    }
}
