//Viviana Yineth Sierra Guzmán
package Taller_Java_Bootcamp;

import java.util.Scanner;

public class Taller_Estr_Control_4 {
    
    public static void main(String[] args) {
        
        int i = 0;
        int Num_Usuario;   
        int Suma_Numero = 0;
            
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Sumatoria de números consecutivos");
        System.out.println("----------------------------------");

        // Ingreso del dato por parte del Usuario
        System.out.println("Ingrese un número: ");
        Num_Usuario = Entrada.nextInt();


        /* Incializamos el contador en 1, incrementado en 1 su valor  hasta que sea igual 
        al dato ingresado por el usuario */
        for (i = 1; i <= Num_Usuario; i++)
        {
            Suma_Numero = Suma_Numero + i;
 
        }

        //Muestra de información al usuario
        System.out.println("***********************************************");
        System.out.println("La sumatoria de los números del 1 al "+ Num_Usuario + " es: "+ Suma_Numero);
        System.out.println("***********************************************");

        Entrada.close();


    }

}
