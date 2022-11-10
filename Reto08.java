package Retos;
import java.util.*;
public class Reto08 
{

    public static void main(String[] args) 
    {
        int cantidad;
        String nombre;
        double tiempo,ganador,perdedor;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Digite cuantos competidores va a ingresar: ");
        cantidad = ingreso.nextInt();
        String[] nombres = new String[cantidad];
        double[] tiempos = new double[cantidad];
        for(int i=0;i<cantidad;i++)
        {
            System.out.println("Ingrese el nombre del competidor "+(i+1));
            nombre = ingreso.next();
            nombres[i]=nombre;
            System.out.println("Ingrese tiempo del competidor en segundos");
            tiempo=ingreso.nextDouble();
            tiempos[i]=tiempo;
        }
        for(int j=0;j<cantidad;j++)
        {
           System.out.println(nombres[j]+" tuvo un tiempo de "+tiempos[j]);     
        }  
        ganador=perdedor=tiempos[0]; 
        for(int i=0;i<cantidad;i++)
        {
            if(tiempos[i]<ganador)
            {
                ganador=tiempos[i];
                System.out.println("El competidor ha ganado con un tiempo de "+ganador);
            }
            else if(tiempos[i]>ganador)
            {
                perdedor=tiempos[i];
                System.out.println("El competidor perdio con un tiempo de "+perdedor);

            }
        }
        ingreso.close();
    }  
}
