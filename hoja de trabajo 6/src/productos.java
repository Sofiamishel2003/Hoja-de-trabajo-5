import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.ArrayList; //Import Arraylist
public class productos {
    private String categoria;
    private String descripcion;
    private String categorias[];
    private ArrayList<String> lineas;
    private Map mapa;
    public productos(Map mapa)
    {
        categoria="";
        descripcion="";
        this.mapa=mapa;
        ArrayList<String> mt = new ArrayList<>();
        mapa.put("Mueble de terraza", mt);
        ArrayList<String> sm = new ArrayList<>();
        mapa.put("Sillones de masaje", sm);
        ArrayList<String> b = new ArrayList<>();
        mapa.put("Bebidas", b);
        ArrayList<String> c = new ArrayList<>();
        mapa.put("Condimentos", c);
        ArrayList<String> f = new ArrayList<>();
        mapa.put("Frutas", f);
        ArrayList<String> ca = new ArrayList<>();
        mapa.put("Carnes", ca);
        ArrayList<String> la = new ArrayList<>();
        mapa.put("Lácteos", la);
    }
    public void agregar_producto(String cat, String prod)
    {
         if (mapa.containsKey(cat))
         {
             ArrayList<String> temp = (ArrayList<String>) mapa.get(cat);
             temp.add(prod);
             mapa.put(cat,temp);
         }
         else
         {
             System.out.println("Categoria ingresada invalida");
         }
    }
    public String buscar_categoria(String value)
    {
        String clave = null;
        boolean bandera=false;
        for (Object entry : mapa.keySet())
        {
            Object x = mapa.get(entry);
            ArrayList<Object> productList = (ArrayList<Object>) x;
            for (Object i : productList) {
                if (i.equals(value)) {
                    bandera=true;
                    clave=("Categoria | Producto\n" + entry + " | " +value);
                    break;
                }
            }
        }
        if (bandera)
            {
                return clave;
            }
        else
        {
            return ("No se encontro el producto buscado");
        }
    }
    public String mostrar()
    {
        String clave = "Categoria | Producto\n";
        for (Object entry : mapa.keySet())
        {
            Object x = mapa.get(entry);
            ArrayList<Object> productList = (ArrayList<Object>) x;
            for (Object i : productList) {
                clave=clave+(entry + " | " +i +"\n");
            }
        }
        return clave;
    }
    public String cantidad()
    {
        String clave = "Categoria | Producto\n";
        int cont=0;
        for (Object entry : mapa.keySet())
        {
            Object x = mapa.get(entry);
            cont=0;
            ArrayList<Object> productList = (ArrayList<Object>) x;
            for (Object i : productList) {
                clave=clave+(entry + " | " +i +"\n");
                cont+=1;
            }
            System.out.println("La cantidad de productos en "+entry+" es : "+cont);
        }
        return clave;
    }
}
