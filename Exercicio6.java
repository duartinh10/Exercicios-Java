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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int nota1;
            System.out.println("Digite a sua nota ");
                nota1 = ler.nextInt();
        int nota2;
            System.out.println("Digite a segunda nota ");
                nota2 = ler.nextInt();
        float media;
            media = (nota1+nota2)/2;
                System.out.printf("A media é "+media);
                    //System.out.printf("A media é %d ", media);
    }
    
}
