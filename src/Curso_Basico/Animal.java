package Curso_Basico;

public class Animal implements Acciones {


        // Atributos
    private String Nombre;
    public String Raza;
    public String Altura;


    // Encapsulamiento de datos mediante metodos- Sentencias Get & Set
    public String GetNombre()
    {
        return Nombre; //Devolver el atributo Nombre
    }


    public void SetNombre(String Name) // Metodo de asignación (void)
    {
        Nombre = Name; //Devolver el atributo Nombre
    }


    @Override
    public String Correr() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String Nadar() {
        // TODO Auto-generated method stub
        return null;
    }

      // Metodos propios de la clase Animal

      public String Dormir()
      {
          return "";
      }

      public String Despertar()
    {
        return "";
    }

    public String HacerRuido()
    {
        return null; //Retorna un String por el tipo del metodo
    }


}
