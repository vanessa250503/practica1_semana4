

package evaluacion_practrica1;

import java.util.Scanner;

public class Evaluacion_practica1{
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        double longitud=1;
        double anchura=1;
        int area_rectangulo;
     
        System.out.println("Ingrese la longitud del rectangulo:");
        longitud=leer.nextDouble();
        System.out.println("Ingrese el perimetro del rectangulo");
        double perimetro = leer.nextDouble();
        System.out.println("Ingrese la base del rectangulo:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = leer.nextDouble();
        
        
        System.out.println("El resultado del perimetro es:" +Evaluacion_practica1.calcularPerimetro(longitud,anchura));
        System.out.println("El resultado del area es:" +Evaluacion_practica1.calcularArea(altura,base));
        
        if( longitud >0 && longitud< 20.00 && anchura>0 && anchura<20.00){
            System.out.println("La longitud es mayor");
        }else{
            System.out.println("La anchura es menor");
        }
        
        
        
    }
    public static double calcularPerimetro(double longitud,double anchura){
        double perimetro=0;
        perimetro= 2*longitud + anchura;                                      
        return perimetro;
        
        
        
    }
    
    public static double calcularArea(double altura, double base){
        double area_rectangulo=0;
        area_rectangulo = (base * altura);
       return area_rectangulo;
    }
    
       
        
    
    
}
        // TODO code application logic here
    
    

