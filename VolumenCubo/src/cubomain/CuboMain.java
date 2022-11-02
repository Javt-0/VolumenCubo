
package cubomain;

import java.util.Scanner;
import dominio.Cubo;
/**
 *
 * @author jonat
 */
public class CuboMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame el ancho del cubo:");
        double ancho = teclado.nextDouble();
        
        System.out.print("Dame el ancho del cubo:");
        double alto = teclado.nextDouble();
        
        System.out.print("Dame el ancho del cubo:");
        double profundidad = teclado.nextDouble();
        
        Cubo c1 = new Cubo(ancho, alto, profundidad);
        System.out.println("El volumen de un cubo es: " + c1.volumen(c1));
    }
    
}
