
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro número: ");
        num2 = leer.nextInt();
        
        if(num1 > 25 && num2 > 25){
            System.out.println("Ambos números son mayores a 25");            
        }else if(num1 > 25){
            System.out.println("El número 1 es mayor a 25");
        }else if(num2 > 25){
            System.out.println("El número 2 es mayor a 25");
        }else{
            System.out.println("Ninguno de los números es mayor a 25");
        }       
    }    
}
