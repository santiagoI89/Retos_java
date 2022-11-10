package Retos;
import java.util.*;
public class Reto09 
{  
    public static void main(String[] args) 
    {
        String nombres;
        double precios;
        String[][] nombre = new String[4][4];
        double[][] precio = new double[4][4];
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina expendedora");
        for(int j=0;j<4;j++)
        {
           for(int i=0;i<4;i++)
          {
            System.out.println("Ingrese nombre del producto almacenado en fila "+(i+1)+" Columna "+(j+1));
            nombres=ingreso.next();
            nombre[i][j]=nombres;
            System.out.println("Ingrese precio del producto almacenado en fila "+(i+1)+" Columna "+(j+1));
            precios=ingreso.nextDouble();
            precio[i][j]=precios;
          }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nombre[i][j] + "" +precio[i][j] +"");
            }    
        }
        ingreso.close();
    }
}
