package Retos;
import java.util.*;
public class Reto07 
{
    public static void main(String[] args) 
    {
        int cantidad=0;
        double nota=0,promedio=0,sumaNota=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Digite cuantas notas va a ingresar");
        cantidad = ingreso.nextInt();
        double[] notas = new double[cantidad];
        for(int i=0; i<cantidad;i++)
        {
            System.out.println("Ingrese la nota: "+(i+1));
            nota=ingreso.nextDouble();
            notas[i]=nota;
            sumaNota=sumaNota+notas[i]; 
            promedio=sumaNota/cantidad;              
        }    
        if(promedio<3.0)
        {
            System.out.println("Su promedio fue: "+promedio);
            System.out.println("Reprobaste la materia");
           
        }
        else if(promedio>=3.0 && promedio<4.0)
        {
            System.out.println("Su promedio fue: "+promedio);
            System.out.println("Pasaste raspando");
        }
        else if(promedio>4.0)
        {
            System.out.println("Su promedio fue: "+promedio);
           System.out.println("Aprobaste con buenos resultados");
        }
        ingreso.close();   
    }
    
}
