/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
        
public class Calculadora {
    //*Nesse projeto vou começar a codar uma calculadora da areas
    public static void main(String[] args) { //*publica a class
        //* definir números
        double Num1 = 10.5;
        double Num2 = 5.2;
        
        
        //realizando as operações matemáticas
        double Somando = Num1 + Num2;
        double Subtracao = Num1 - Num2;
        double Multiplicacao = Num1 * Num2;
        double Divisao = Num2 != 0 ? Num1 / Num2 : Double.NaN; // NaN para o número ficar contido dentro da variavel, ! para saber se o numero e diferente de 0por exemplo
        double resto = Num1 % Num2;
        
        //Mostrando os resultados
        System.out. println("Resultado das operações:"); //* mostra na tela
        System.out.println("Soma: " + Somando);
        System.out.println("Subtracao: " + Subtracao);
        System.out.println("Multiplicacao: " + Multiplicacao);
        System.out.println("Divisão: " +(Num2 != 0 ? Divisao :
                "indefinida (Divisão por zero)"));
        System.out.println("O Resto é: " +resto);
    }
}
