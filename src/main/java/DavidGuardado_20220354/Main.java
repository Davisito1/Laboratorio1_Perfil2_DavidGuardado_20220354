package DavidGuardado_20220354;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Producto> map = new TreeMap<>();

        int opc;
        do {
            System.out.println("-----Sistema de gestion de productos-----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion a realizar: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("ID del producto: ");
                    int id = sc.nextInt();

                    System.out.print("Nombre del producto:");
                    String nombre = sc.next();

                    System.out.print("Precio del producto:");
                    double precio= sc.nextDouble();

                    map.put(id, new Producto(nombre, precio));
                    System.out.println("Se agrego el producto");
                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Elija una opcion valida");
            }
        } while (opc != 5);
    }
}