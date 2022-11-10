package Retos;
import java.util.*;
public class Reto05 
{
    public static void main(String[] args) 
    {
        int cantidadProductos=1,contadorProductos;
        double precioProductos,totalCompra=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Calculador de precio de compra"); 
        System.out.println("Digite la cantidad de productos que va a ingresar");
        contadorProductos =ingreso.nextInt();                       
        do
        {                          
            System.out.println("Ingrese el precio del producto");
            precioProductos = ingreso.nextDouble();  
            cantidadProductos++;    
            totalCompra =totalCompra+precioProductos;                                  
        }
        while(cantidadProductos<=contadorProductos);          
        System.out.println("____________________");
        System.out.println("El total de su compra es: "+totalCompra);
        ingreso.close();
    }
}
