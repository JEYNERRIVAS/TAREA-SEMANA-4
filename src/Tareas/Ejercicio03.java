package Tareas;

import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[]args){
        int num;
        String mensaje="";
        Scanner lectura=new Scanner(System.in);
        //INGRESO DE DATOS
        System.out.print("ingrese un numero del 1 al 6: ");
        num=lectura.nextInt();
        //PROCESO DE DATOS
        switch (num) {
            case 1:mensaje="One"; break;
            case 2:mensaje="Two"; break;
            case 3:mensaje="Three"; break;
            case 4:mensaje="Four"; break;
            case 5:mensaje="Five"; break;
            case 6:mensaje="Six"; break;
   }
        //SALIDA DE DATOS
        System.out.println("El numero ingresado en ingles es : "+mensaje);
    }
    
}
