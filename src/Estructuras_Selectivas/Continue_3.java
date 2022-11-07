package Estructuras_Selectivas;

public class Continue_3 {

    public static void main(String[] args) {
        
        System.out.println("Tabla de multiplicar del 8: ");

        for (int i = 0; i <= 10; i++)
        {
            if (i >= 9)
            {
                System.out.println("Condición Continue Cumplida");
                continue; // Continue devuelve el control al for 
            }
    
            System.out.println(8 + " * " + i + " = " + 8 * i);
        }


    }
    
}
