package Tareas;
/*
1.- Crear un programa que permita ingresar un número (1-5) entero. 
Visualizar el número ingresado en palabra.
Número=2
Palabra=”dos”
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[]args){
        int num;
        String mensaje="";
      Scanner lectura=new Scanner(System.in);
      //INGRESO DE DATOS
        System.out.print("ingrese un numero del 1 al 5 : ");
        num=lectura.nextInt();
        //PROCESAR DATOS
        switch (num) {
            case 1:mensaje="uno"; break;
            case 2:mensaje="dos"; break;
            case 3:mensaje="tres"; break;
            case 4:mensaje="cuatro"; break;
            case 5:mensaje="cicno"; break;
        }
        // SALIDA DE DATOS
        System.out.println("El numero ingresado es el : "+mensaje);
                  
    }  
}
