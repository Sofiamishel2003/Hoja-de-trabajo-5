/**
 * La clase Factory es una factoría para la creación de diferentes implementaciones de mapas.
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList; //Import Arraylist
public class factory {

    /**
     * Crea una nueva instancia de la implementación de pila especificada por el parámetro e.
     *
     *@param e el entero que indica la implementación de mapa a crea
     *
     *          1 para un mapa de HashMap
     *          2 para un mapa de TreeMap
     *          3 para un mapa de LinkedHashMap
     *@return una nueva instancia de la implementación de pila especificada por el parámetro e.
     *@throws IllegalArgumentException si se proporciona un valor de e no válido.
     */
    public static Map make_map(int e) {
        switch (e) {
            case 1: //HashMap
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                return hashMap;
            case 2: //TreeMap
                TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();
                return treeMap;
            case 3: //LinkedHashMap
                LinkedHashMap<String, ArrayList<String>> linkedHashMap = new LinkedHashMap<>();
                return linkedHashMap;
            default:
                throw new IllegalArgumentException("Dato invalido");
        }
    }
}