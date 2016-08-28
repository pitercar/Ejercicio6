/*
Algoritmo que lea el número de producto que ingresa el usuario y que le muestre su precio
 */
package ejercicio6;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio6 {
    
   private  int producto1, producto2, producto3, producto4;
   
   public void cargarDatos(){
       Scanner entrada=new Scanner(System.in);
       
       System.out.println("escoje un producto: ");
       System.out.println("1: Producto 1");
       System.out.println("2: Producto 2");
       System.out.println("3: Producto 3");
       System.out.println("4: Producto 4");
       
       int producto=entrada.nextInt();

       switch (producto){
       
           case 1:
               System.out.println("El producto 1 cuesta $500 ");
               break; 
               
           case 2:   
               System.out.println("El producto 2 cuesta $800");
               break;
               
           case 3:
               System.out.println("El producto 3 cuesta $300");
               break;
               
           case 4:
               System.out.println("El producto 4 cuesta $900");
               break;
               
            default: 	
		System.out.println("La opción no es correcta ");
            }          
   }
   
   public void dondeVoy(){
       System.out.println("Aqui voy creando clase....");
       
   }
}
