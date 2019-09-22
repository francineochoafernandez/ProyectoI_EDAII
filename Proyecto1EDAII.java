/*
 * Proyecto 1
 * Estructura de Datos y Algoritmos II
 * Integrantes: Pereda Ceballos Jorge Francisco
 *              Ochoa Fernández Francine
 *              Bazán Silva Miguel Alberto
 */
package proyecto1edaii;
import java.util.*;
import java.io.*;

public class Proyecto1EDAII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = null;
        int opc = 0;
        File archivo = null;
        
        System.out.println("Bienvenido\nEste es un Programa que ordena elementos Numericos dentro de un archivo .txt");
        System.out.print("Ingrese el nombre del archivo a ordernar: ");
        nombreArchivo= sc.nextLine();
        archivo = new File(nombreArchivo);
        
        
        do{
            
            switch(Bienvenida(opc)){
                case 1:
                    //Funcion de ordenamiento por POLIFASE
                    System.out.println("OP 1");
                    break;
                case 2:
                    //Funcion de ordenamiento por MEZCLA EQUILIBRADA
                    System.out.println("OP 2");
                    break;
                case 3:
                    //Funcion de ordenamiento por RADIX
                    System.out.println("OP 3");
                    break;
                case 4:
                    // SALIDA del programa
                    System.out.println("Gracias por su preferencia");
                    break;
                default:
                    //Bucle para elegir una opcion correcta
                    System.out.println("Ingrese una de las opciones diponibles");
            }
            System.out.println(opc);
            System.out.println(nombreArchivo);
            
        }while(opc!=4);
    }
    
    public static int Bienvenida(int opc){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione uno de las siguientes métdos para ordenar el contenido del archiv: \n1.-Polifase \n2.-Mezcla equilibrada \n3.-Método de distribucióm \n4) Salir");
        opc = sc.nextInt();
        return opc;
    }
    
}
