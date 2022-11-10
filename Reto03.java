package Retos;
import java.util.Random;
import java.util.Scanner;
public class Reto03 
{
    public static void main(String[] args) 
    {
        int numero,numeroRandom;
        Random random = new Random();
        Scanner ingreso = new Scanner(System.in); 
          
        System.out.println("Programa Moneda cara o sello \n Si cree que el resultado sera cara digite 1\n Si cree que el resultado sera sello digite 2");
        numero = ingreso.nextInt();
        numeroRandom = random.nextInt(2)+1;
         if(numero == numeroRandom)
         {
            System.out.println("Haz ganado el resultado fue "+ numeroRandom+" Eleccion correcta");
         }
         else
         {
            System.out.println("Perdiste el resultado fue "+numeroRandom+" Eleccion incorrecta");
         }
         ingreso.close();
    }    
}