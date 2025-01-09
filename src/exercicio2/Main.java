package src.exercicio2;

public class Main {

    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();

        Operacao soma = new Soma();
        System.out.println("Soma: " + calculadora.executarOperacao(soma, 6, 5));

        Operacao subtracao = new Subtracao();
        System.out.println("Subtracao: " + calculadora.executarOperacao(subtracao, 6, 5));

        Operacao multiplicao = new Multiplicacao();
        System.out.println("Multiplicação: " + calculadora.executarOperacao(multiplicao, 6, 5));
    }
}
