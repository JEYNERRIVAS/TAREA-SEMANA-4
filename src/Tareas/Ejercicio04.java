package Tareas;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[]args){
        int num;
        String periodo="";
        Scanner lectura=new Scanner(System.in);
        //INGRESO DE DATOS
        System.out.print("Ingrese un periodo del año en numeros :");
        num=lectura.nextInt();
        //PROCESO DE DATOS
        switch (num) {
            case 1:periodo="Mensual"; break;
            case 2:periodo="Bimestral"; break;
            case 3:periodo="Trimestral"; break;
            case 4:periodo="Cuatrimestral"; break;
            case 6:periodo="Semestral"; break;
            case 12:periodo="Anual"; break;
        }
        //SALIDA DE DATOS
      System.out.println("El periodo ingresado es : "+periodo);
        
    }
    
}
