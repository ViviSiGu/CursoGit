package Arrays;
import java.util.Scanner;

public class Arrays_Ejemplos {


    public static void main(String[] args) 
    {

        Scanner entrada = new Scanner(System.in);
        int Suma_Precios = 0;
        double Prom_Precios = 0;


        String [] Apellidos = new String [7];  
        Apellidos [0] = "Sierra";   
        Apellidos [1] = "Guzman"; 
        Apellidos [2] = "Parra"; 
        Apellidos [3] = "Ortiz"; 
        Apellidos [4] = "Ruiz"; 
        Apellidos [5] = "Mora"; 
        Apellidos [6] = "Caro"; 

        /*  Lenght = Tamaño del arreglo
           i inicializada en cero   i = 0
           Si i es menor que el tamano de Apellidos
           i++ = sumar 1 a i
        */

        for(int i = 0; i < Apellidos.length ; i++)
        {

            System.out.println(Apellidos[i]);

        }
   
        int [] Precios = new int [3];

        // For para guardar los datos en el arreglo
        for(int i = 0; i < Precios.length ; i++)
        {

            System.out.println("Dame el precio: ");
            Precios[i] = entrada.nextInt();

        }
        entrada.close();

        //For para imprimir los datos del arreglo
        for(int i = 0; i < Precios.length ; i++)
        {
            
            System.out.println(Precios[i]);

        }

        for (int i = 0; i < Precios.length ; i++)
        {
            Suma_Precios = Suma_Precios + Precios[i];
        }


        for (int i = 0; i < Precios.length ; i++)
        {
           Prom_Precios = Suma_Precios / Precios.length;
        }


        System.out.println("******************************* ");
        System.out.println("La suma de los precios es: " + Suma_Precios);
        System.out.println("El promedio de los precios es: " + Prom_Precios);
    }
}

