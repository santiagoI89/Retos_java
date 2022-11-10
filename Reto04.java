package Retos;
import java.util.*;
public class Reto04 
{
    public static void main(String[] args) 
    {
        int eleccion,randomico;
        Random random = new Random();
        Scanner ingreso = new Scanner(System.in); 
        System.out.println("Bienvenido al juego Piedra, Papel o Tijera");
        System.out.println("Selecciona una de las opciones con las quieres jugar");
        System.out.println("1. Tijera \n2. Papel \n3. Piedra");
        eleccion = ingreso.nextInt();
        randomico = random.nextInt(3)+1;
        switch(eleccion)
        {
            case 1:
            {
                System.out.println("Sacas Tijera");
                System.out.println("La maquina saca "+ randomico);
                if(randomico ==1)
                {
                    System.out.println("Haz empatado con la maquina");
                }
                else if(randomico==2)
                {
                  System.out.println("Eres el ganador");
                }
                else if(randomico==3)
                {
                  System.out.println("La maquina gana");
                }
                break;
            }
            case 2:
            {
                System.out.println("Sacas papel");
                System.out.println("La maquina saca "+ randomico);
                if(randomico ==1)
                {
                    System.out.println("La maquina gana");
                }
                else if(randomico==2)
                {
                  System.out.println("Haz empatado con la maquina");
                }
                else if(randomico==3)
                {
                  System.out.println("Eres el ganador");
                }
                break;
            }
            case 3:
            {
                System.out.println("Sacas Piedra");
                System.out.println("La maquina saca "+ randomico);
                if(randomico ==1)
                {
                    System.out.println( "Eres el ganador");
                }
                else if(randomico==2)
                {
                  System.out.println("Eres el ganador");
                }
                else if(randomico==3)
                {
                  System.out.println("Haz empatado con la maquina");
                }
                break;
            }
        }
        ingreso.close();
    }
}