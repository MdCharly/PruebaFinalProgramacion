package ProyectoTPV;
import java.util.HashMap;
import java.util.Map;

public class ListaProducto {

    private Map Producto = new HashMap();
    public Object ListaProducto () {

        String PelotaFutbol = new String(String.valueOf(50));
        String PelotaBaloncesto = new String(String.valueOf(50));
        String PelotaBeisbol= new String(String.valueOf(50));
        String ChandalAdidas = new String(String.valueOf(50));
        String ChandalFila = new String(String.valueOf(50));
        String ChandalNike = new String(String.valueOf(50));
        String ZapatillaConverse = new String(String.valueOf(50));
        String ZapatillaPuma = new String(String.valueOf(50));
        String ZapatillaAsics = new String(String.valueOf(50));

        int precioFutbol = new int(3);
        int precioBaloncesto = new int(3);
        int precioBeisbol = new int(3);
        int precioAdidas = new int(3);
        int precioFila = new int(3);
        int precioNike = new int(3);
        int precioConverse = new int(3);
        int precioPuma = new int(3);
        int precioAsics = new int(3);

        Producto n,p;
        p= new Producto(PelotaFutbol,precioFutbol,"Arial");
        n= new Producto(""),"Arial");


    public Producto getProducto ( String nombre){
        return Producto.get(getProducto.getNombre());
        }
    }
}
