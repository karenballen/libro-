import Libro.libro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<libro> libro= new ArrayList<>();
        int opcion;

        do{
            System.out.println("-------MENU DE OPCIONES--------");
            System.out.println("1.Crear un Libro Impreso");
            System.out.println("2.Crear un Libro Digital");
            System.out.println("3.Crear un Libro Precio");
            System.out.println("4.Mostrar los Libros");
            System.out.println("5.Buscar Un Libro Por Titulo ");

            opcion=sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("titulo ");
                    String titulo = sc.nextLine();
                    System.out.println("Autor ");
                    String autor = sc.nextLine();
                    System.out.println("Precio ");
                    double precio = sc.nextDouble();
                    System.out.println("Cantidad de jemplares ");
                    int cantidadjemplares = sc.nextInt();
                    libro.add(new libroimpreso(titulo,autor,precio,cantidadjemplares));
                    System.out.println("------libro creado correctamente------");
                    break;

                    case 2:
                        System.out.println("titulo ");
                        String titulo2 = sc.nextLine();
                        System.out.println("Autor ");
                        String autor2 = sc.nextLine();
                        System.out.println("Precio ");
                        double precio2 = sc.nextDouble();
                        System.out.println("Tamaño (MB):");
                        double tamaño = sc.nextDouble();
                        System.out.println("¿Esta disponible?");
                        boolean disponible = sc.nextBoolean();





            }


        }
        }
}