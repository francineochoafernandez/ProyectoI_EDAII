package llenadoarchivos;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class LlenadoArchivos {
    public static void main(String[] args) {
        int clavesArchivo;
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la claves para llenar el archivo");
        opc= sc.nextInt();
        switch(opc){
            case 500: 
            File archivo500= new File("Archivo500.txt");
               LlenadoArchivos llenado500 =  new LlenadoArchivos();
               llenado500.llenadoClaves(archivo500, opc);
                break;
             
            case 750:
            File archivo750= new File("Archivo750.txt");
               LlenadoArchivos llenado750 =  new LlenadoArchivos();
               llenado750.llenadoClaves(archivo750, opc);
                break;
            case 777:
            File archivo777= new File("Archivo777.txt");
                break;
            case 1000:
            File archivo1000= new File("Archivo1000.txt");
                break;
            default:
                System.out.println("no es posible llenar un archivo con tal cantidad de claves");
         }
    }
        
    public  void llenadoClaves(File archivo, int opc){
        Random rd = new Random();
        Float randomNumber;   
        
        try{    
                      FileWriter w = new FileWriter(archivo);
                      BufferedWriter bw = new BufferedWriter(w);
                      PrintWriter wr = new PrintWriter(bw);
                      
                     for(int i=0;i<opc;i++){
                                randomNumber = rd.nextFloat();
                                randomNumber.toString();
                                
                                w.write(randomNumber+",");
                              
                     }
                             
                     wr.close();        
                     w.close();
                     System.out.println("Archivo lleno con " + opc+ " claves");
        }catch(IOException e){};
        
    }    
    
}
