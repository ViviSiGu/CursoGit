//Viviana Yineth Sierra Guzmán
package Arrays;

import java.util.Scanner;

public class Pos_Neg_Arrays {
    public static void main (String[] args)  {

        Scanner Entrada = new Scanner(System.in);

        //Arreglo de 10 posiciones de tipo entero
        int [] Lista_Num = new int [10];

        int Cant_Positivos = 0;
        int Cant_Negativos = 0;
        int Cant_Ceros = 0;

        float Sum_Positivos = 0;
        float Sum_Negativos = 0;

        float Prom_Positivos = 0;
        float Prom_Negativos = 0;


        //Ingreso de datos al arreglo de 10 posiciones
        for (int i = 0; i < Lista_Num.length; i++)
        {
            System.out.println("Ingrese el numero: ");
            Lista_Num[i] = Entrada.nextInt();

            //Calsificación de numeros entre positivos, negativos y cero
            if(Lista_Num[i] > 0)
            {
                //Sumatoria de cantidad de números positivos 
                Cant_Positivos ++;
            }
            
            else if (Lista_Num[i] < 0)
            {
                //Sumatoria de cantidad de números negativos
                Cant_Negativos ++;
            }

            else 
            {
                //Sumatoria de cantidad de ceros
                Cant_Ceros ++;
            }

        }

        Entrada.close();

        /* Declaración de arreglos de números positivos y negativos
           con cantidad de posiciones de acuerdo a los contadores*/

        float Array_Pos [] = new float [Cant_Positivos];
        float Array_Neg [] = new float [Cant_Negativos];


        /*Inicializar  contadores para usarlos como iteradores 
          en los arreglos de números postivos y negativos*/

        int Cont_Pos = 0;
        int Cont_Neg = 0;


        
        for (int i = 0 ; i < Lista_Num.length; i++)
        {
            //Pregunta sí es número positivo
            if (Lista_Num [i] > 0)
            {

                Array_Pos[Cont_Pos]= Lista_Num[i];
                Cont_Pos++;
            }

            //Pregunta sí es número negativo
            else if (Lista_Num [i] < 0)
            {
                Array_Neg[Cont_Neg] = Lista_Num[i];
                Cont_Neg ++;
            }
        }


        System.out.println("******************************" );
        
        for (int i = 0; i < Cont_Pos; i++)
        {
            Sum_Positivos = Sum_Positivos + Array_Pos[i];
                        
        }

        Prom_Positivos = Sum_Positivos / Array_Pos.length;
        System.out.println("Promedio Positivos = " + Prom_Positivos);

        
        for (int i = 0; i < Cont_Neg; i++)
        {
            Sum_Negativos = Sum_Negativos + Array_Neg[i];
                       
        }

        Prom_Negativos = Sum_Negativos / Array_Neg.length;
        System.out.println("Promedio Negativos = " + Prom_Negativos);
        System.out.println("******************************" );
    }
    
}
