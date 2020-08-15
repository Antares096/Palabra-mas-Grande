package palabramaslarga;

import java.util.Scanner;

/*
Ejemplo:
    Todos los animales son inteligentes
      0    1    2       3       4
      Palabra mas grande: inteligentes
      cantidad de letras: 12
      posicion: 4
*/
public class Main {

    public static Scanner scan;

    public static void main(String[] args) {

        String oracion = Expresion();

        String conjunto_palabra [] = ConjuntoPalabras(oracion);

        PalabraGrande(conjunto_palabra);
    }

    public static String Expresion()
    {
        scan = new Scanner(System.in);
        System.out.println("Escriba una oración: ");

        String expresion = scan.nextLine();

        return expresion;
    }

    public static String [] ConjuntoPalabras(String exp)
    {
        String [] palabras_conjunto = exp.split(" ");

        return palabras_conjunto;
    }

    public static void PalabraGrande(String p [])
    {
        int tam_palabra = 0;
        int index = 0;

        for(int i = 0; i < p.length; i++)
        {
            if(p[i].length() > tam_palabra)
            {
                tam_palabra = p[i].length();
                index = i;
            }
        }

        String p_mayor = p[index];

        System.out.println("La palabra más grande es: "+p_mayor);
        System.out.println("Se encuentra en la posicion: "+index);
        System.out.println("Cantidad de caracteres que tiene la plabra: "+tam_palabra);
    }
}
