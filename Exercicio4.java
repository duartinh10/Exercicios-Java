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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();
        int antecessor;
        antecessor = numero - 1;
        System.out.println("O antecessor do "+numero+" e "+antecessor);
    }
    
}
