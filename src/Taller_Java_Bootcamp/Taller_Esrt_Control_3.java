//Viviana Yineth Sierra Guzmán
package Taller_Java_Bootcamp;

import java.util.Scanner;

public class Taller_Esrt_Control_3 {
    public static void main(String[] args) {

        int i = 0;
        int Num_Usuario;   
        int Suma_Numero = 0;
  
    
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Sumatoria de números consecutivos");
        System.out.println("----------------------------------");

        // Ingreso del dato por parte del Usuario
        System.out.println("Ingrese un numero: ");
        Num_Usuario = Entrada.nextInt();

        // Mientras que se cumpla la condición ejecute la sumatoria
        while (i <= Num_Usuario)
        {
            Suma_Numero = Suma_Numero + i;
            i++;
        }
        
        Entrada.close();

        //Muestra de información al usuario
        System.out.println("***********************************************");
        System.out.println("La sumatoria de los números del 1 al "+ Num_Usuario + " es: "+ Suma_Numero);
        System.out.println("***********************************************");

        Entrada.close();

    } 
}
    

