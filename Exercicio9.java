/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ExercicioEmSala;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int produto;
            System.out.print("Digite um numero: ");
                numero1 = ler.nextInt();
            System.out.print("Digite outro numero :");
                numero2 = ler.nextInt();
            System.out.print("Digite mais um numero: ");
                numero3 = ler.nextInt();
        produto = (numero1 * numero2 * numero3);
            System.out.printf("O produto é %d %n",produto);
            
    }
    
}
