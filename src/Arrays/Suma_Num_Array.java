//Viviana Yineth Sierra Guzmán
package Arrays;

public class Suma_Num_Array {
    
    public static void main (String[] args) {

        //Declaración de arreglo de cien posiciones
        int [] Nums = new int[100];
        int Contador_Num = 1;
        int Suma_Numeros = 0;
        float Prom_Numeros;



        for (int i = 0; i < Nums.length; i++)
        {
            Nums[i]= Contador_Num ++;
            System.out.println("Numero "+ i + ": " + Nums[i]);
            Suma_Numeros = Suma_Numeros + Nums[i];
        }
        
        //Impresión de la sumatoria de los numeros del arreglo
        System.out.println("******************************");
        System.out.println("Sumatoria Numeros: " + Suma_Numeros);

        //Impresión del promedio de los numeros del arreglo
        Prom_Numeros = Suma_Numeros / Nums.length;
        System.out.println("Promedio: " + Prom_Numeros);
        System.out.println("******************************");


    }
}
