
package ejercicios;

import static ejercicios.LetraONumero.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        if (Character.isLetter(caracter)) {
            if (Character.isUpperCase(caracter)) {
                return "Es letra mayúscula";
            } else {
                return "Es letra minúscula";
            }
        } else if (Character.isDigit(caracter)) {
            return "Es número";
        } else {
            return "No es letra ni número";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
