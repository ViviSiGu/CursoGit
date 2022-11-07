package Estructuras_Selectivas;

public class Continue {
    public static void main(String[] args) {

        System.out.println("Tabla de multiplicar del 2: ");

        for (int i = 0; i <= 10; i++)
        {
            if (i == 5)
            {
                System.out.println("Condición Continue Cumplida");
                continue; // Continue devuelve el control al for 
            }

            System.out.println(2 + " * " + i + " = " + 2 * i);
        }
        
    }
    
}
