/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraunicesumar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author genario
 */
public class CalculadoraUnicesumar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double valor1, valor2;
       double soma, subtracao, multiplicacao, divisao, exponenciacao;
       int opcao;
       Scanner entrada = new Scanner(System.in);
      
       opcao = 1;
               
       while(opcao != 0){
       
            JOptionPane.showMessageDialog(null,"SELECIONE A OPERAÇÃO QUE DESEJA REALIZAR");
            System.out.println("[0] - INTERROMPER");
            System.out.println("[1] - SOMAR");
            System.out.println("[2] - SUBTRAIR");
            System.out.println("[3] - MULTIPLICAR");
            System.out.println("[4] - DIVIDIR");
            System.out.println("[5] - ELEVAR");
            System.out.println(">>DIGITE SUA OPERAÇÃO: <<");
            opcao =  entrada.nextInt();
     
        
            switch (opcao) {
                
                case 1:
                    System.out.println("Informe o primeiro valor: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("Informe o segundo valor: ");
                    valor2 = entrada.nextDouble();
                    soma = valor1 + valor2;
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: "+soma);
                    break;
                    
                case 2:
                    System.out.println("Informe o primeiro valor: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("Informe o segundo valor: ");
                    valor2 = entrada.nextDouble();
                    subtracao = valor2-valor1;
                    JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+subtracao);
                    break;
                    
                case 3:
                    System.out.println("Informe o primeiro valor: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("Informe o segundo valor: ");
                    valor2 = entrada.nextDouble();
                    multiplicacao = valor1*valor2;
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+multiplicacao);
                    break;
                    
                case 4:
                    System.out.println("Informe o primeiro valor: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("Informe o segundo valor: ");
                    valor2 = entrada.nextDouble();
                    if(valor1<valor2){
                        System.out.println("Impossivel realizar o calculo");
                    }else{
                    divisao = valor1/valor2;
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+divisao);
                    };
                    break;
                    
                case 5:
                    System.out.println("Informe o valor à ser elevado: ");
                    valor1 = entrada.nextDouble();
                    exponenciacao = Math.pow(valor1, 2);
                    JOptionPane.showMessageDialog(null, "O resultado da exponenciacao é: "+exponenciacao);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null,"OPERAÇÃO INTERROMPIDA. \n"+"OBRIGADO POR UTILIZAR A CALCULADORA");
                }
       }
    }
}
