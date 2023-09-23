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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int numero1;
            System.out.println("Digite um numero ");
                numero1 = ler.nextInt();
       int numero2;
            System.out.println("Digite outro numero ");
                numero2 = ler.nextInt();
       int num1;
            num1 = numero2;
       int num2;
            num2 = numero1;
            System.out.printf("O numero1 é %d e o numero2 é %d ",num1,num2);
    }
    
}
