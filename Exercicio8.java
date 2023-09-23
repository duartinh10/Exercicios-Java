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
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int mes;
            System.out.println("Quantos meses : ");
                mes = ler.nextInt();
       float mesrend;
                mesrend = (float) (0.007 * mes);
       float valor;
            System.out.println("Digite o valor depositado:");
                valor = ler.nextFloat();
       float valorea;
            valorea = valor * mesrend;
                System.out.printf("O valor reajustado é %f ",valorea);
       float valorfinal;
            valorfinal = valor + valorea;
                System.out.printf("O valor total é %f ",valorfinal);
    }
    
}
