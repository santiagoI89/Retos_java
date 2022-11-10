package Retos;
import java.util.*;
public class Reto06 
{
    public static void main(String[] args) 
    {
        int numero,numeroRandom,decision=0;
        double apuestaInicial,gananciaFinal=0,victoria=500;
        Random random = new Random();
        Scanner ingreso = new Scanner(System.in);        
        System.out.println("Bienvenido al cara y sello");          
        do{
            System.out.println("Ingrese el valor a apostar");
            apuestaInicial = ingreso.nextDouble(); 
            System.out.println("Si cree que el resultado sera cara digite 1\n Si cree que el resultado sera sello digite 2");
            numero = ingreso.nextInt();
            numeroRandom = random.nextInt(2)+1;
            if(numero == numeroRandom)
         {
            System.out.println("Haz ganado el resultado fue "+ numeroRandom+" Eleccion correcta");
            gananciaFinal= gananciaFinal+apuestaInicial + victoria;
         }
         else
         {
            System.out.println("Perdiste el resultado fue "+numeroRandom+" Eleccion incorrecta");
            gananciaFinal= gananciaFinal - apuestaInicial - victoria;
         }
         System.out.println("¿Desea seguir jugando?");
         System.out.println("Digite 1 para continuar");
         System.out.println("Digite 2 para finalizar");
         decision = ingreso.nextInt();  
         if(decision==1)
         {
            System.out.println("Continuando.......................");
         } 
         else
         {
             System.out.println("El total de sus ganacias fue "+ gananciaFinal);
         }  
        }
         while(decision==1); 
         ingreso.close();     
    }   
}
