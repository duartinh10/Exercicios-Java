/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmSala;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner ler = new Scanner(System.in);
       int numero1;
            System.out.print("Digite um numero: ");
                numero1 = ler.nextInt();
       int numero2;
            System.out.print("Digite outro numero: ");
                numero2 = ler.nextInt();
       int soma;
            soma = numero1 + numero2;
                //System.out.printf("A soma de "+numero1+" e "+numero2+" e = "+soma);
                    System.out.printf("A soma de %d + %d = %d",numero1,numero2,soma);
    }
    
}
