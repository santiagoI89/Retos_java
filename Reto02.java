package Retos;
import java.util.*;
public class Reto02 
{
    public static void main(String[] args) 
    {
        int meses,meses_total;
        double peso,peso_total,dosis;    

        Scanner ingreso = new Scanner(System.in);        
        System.out.println("ingrese los meses del bebe");
        meses =ingreso.nextInt();
        System.out.println("ingrese el peso del bebe");
        peso = ingreso.nextDouble();

        meses_total = meses * 10;
        peso_total = peso + 10;
        dosis = (peso_total/meses_total*8);
        
        System.out.println("La dosis necesaria es "+dosis);
        ingreso.close();
    }
}
