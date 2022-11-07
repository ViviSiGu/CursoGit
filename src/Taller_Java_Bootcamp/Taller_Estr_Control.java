//Viviana Yneth Sierra Guzmán
package Taller_Java_Bootcamp;

import java.util.Scanner;

public class Taller_Estr_Control {

    public static void main(String[] args) {
        
        //Objeto que permite el ingreso de información por parte del usuario
        Scanner Entrada = new Scanner(System.in);

        int Num_Usuario;
        int Numero_Primo;
        int Suma_Ceros = 0;


        System.out.println("¿Número primo?");
        System.out.println("-----------------");

        //Entrada del dato por parte del usuario y guardado en la variable Num_Usuario
        System.out.println("Ingrese un numero: ");
        Num_Usuario = Entrada.nextInt();

        /* Cumplimiento de la condición de que el numero sea divisible por si mismo
           y verificacióbn de los valores inferiores hasta el limite "1" */
        for (int i = 1; i <= Num_Usuario; i++)
        {

            //Evaluación de la condicion de que el residuo de la división sea igual a cero
            Numero_Primo = Num_Usuario%i;

            if (Numero_Primo == 0)
            {
                //Sumatoria de veces en que el resultado fue cero
                Suma_Ceros++;
            }
        }

        System.out.println("***********************************");
        
        /*Evaluación de que el número ingresado tenga como residuo dos veces el valor de cero
          es decir que sea divisible por si mismo y por uno */
        if (Suma_Ceros == 2)
        {
            System.out.println("El número " + Num_Usuario + " es primo");

        }      
        else
        {
            System.out.println("El número ingresado no es primo");
        } 
            
        // Cierre del objeto de ingreso de datos
        Entrada.close();
    }
   
}
