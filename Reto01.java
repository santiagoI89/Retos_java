package Retos;
import java.util.*;
public class Reto01 
{
    public static void main(String[] args) 
    {
        
        int grados,centigrados;
        double resultado;
        
        System.out.println("Ingrese el valor en grados fahrenheit");
        Scanner entrada = new Scanner(System.in);
        
        grados = entrada.nextInt();
        centigrados = (grados-32);
        resultado = centigrados/1.8;
        System.out.println(resultado);
        entrada.close();       
    }
}
