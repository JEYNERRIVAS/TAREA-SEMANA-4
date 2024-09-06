package Tareas;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[]args){
        int num;
        String mensaje="";
         Scanner lectura=new Scanner( System.in);
        //INGRESO DE DATOS
         System.out.print("ingrese un numero del 1 al 10 :");
         num=lectura.nextInt();
         //PRROCESO DE DATOS
         switch (num) {
            case 1:mensaje="I"; break;
            case 2:mensaje="II"; break;
            case 3:mensaje="III"; break;
            case 4:mensaje="IV"; break;
            case 5:mensaje="V"; break;
            case 6:mensaje="VI"; break;
            case 7:mensaje="VII"; break;
            case 8:mensaje="VIII"; break;
            case 9:mensaje="IX"; break;
            case 10:mensaje="X"; break;
        }
         //SALIDA DE DATOS
         System.out.println("El numero ingresado en Romano es : "+mensaje);
    }
    
}
