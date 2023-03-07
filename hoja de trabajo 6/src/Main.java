import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        String[] values;
        String key;
        String value;
        Map mapa;
        Scanner in = new Scanner(System.in);

        // System.out.println("Bienvenido al simulador de mapas \n Escoge una opcion\n 1.Usar simulador\n 2.Salir");
        System.out.println("Bienvenido al simulador de mapas \n Escoge una opcion\n 1.Usar HashMap\n 2.Usar TreeMap\n 3.Usar LinkedHashMap");
        int e=in.nextInt();
        mapa=  factory.make_map(e);
        archivos file =new archivos();
        productos inventario= new productos(mapa);
        ArrayList<String> lineas= file.read_file("ListadoProducto.txt");
        for (String str : lineas) //para agregar los del archivo a un mapa
        {
            values = str.split("\\|");
            key = values[0].trim();
            value = values[1].trim();
            inventario.agregar_producto(key,value);
        } //ya está el mapa del archivo
        int j=0;
        Map mapa_usuario=  factory.make_map(e);
        productos inventario2=new productos(mapa_usuario);
        while (j!=7)
        {
            System.out.println("Escoge una opcion\n 1.Agregar producto\n 2.Buscar la categoria del producto\n 3.Mostrar los datos del producto\n 4.Mostrar los datos del producto en orden\n 5.Mostrar la categoria y producto de todo el inventario\n 6.Mostrar el la categoria y producto de todo\n 7.Salir");
            j=in.nextInt();
            switch (j)
            {
                case 1:
                    System.out.println("Vamos a buscar el producto deseado-----------\n Ingrese el nombre del producto");
                    value=in.nextLine();
                    value=in.nextLine();
                    System.out.println(" Ingrese el nombre de la categoria");
                    key=in.nextLine();
                    inventario2.agregar_producto(key,value);
                    break;
                case 2:
                    System.out.println("Vamos a buscar la categoria de producto deseado-----------\n Ingrese el nombre del producto");
                    value=in.nextLine();
                    value=in.nextLine();
                    System.out.println(inventario.buscar_categoria(value));
                    break;
                case 3:
                    System.out.println(inventario2.cantidad());
                    break;
                case 4:
                    System.out.println(inventario2.cantidad());
                    break;
                case 5:
                    System.out.println(inventario.mostrar());
                    break;
                case 6:
                    System.out.println(inventario.mostrar());
                    break;
                default:
                    System.out.println("Opcion ingresada invalida");
                    break;
            }
        }

    }
}
