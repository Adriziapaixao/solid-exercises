import src.lsp.Forma;
import src.lsp.Quadrado;
import src.lsp.Retangulo;
import src.out.*;

public class Main {

    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();

        Operacao soma = new Soma();
        System.out.println("Soma: " + calculadora.executarOperacao(soma, 6, 5));

        Operacao subtracao = new Subtracao();
        System.out.println("Subtracao: " + calculadora.executarOperacao(subtracao, 6, 5));

        Operacao multiplicao = new Multiplicacao();
        System.out.println("Multiplicação: " + calculadora.executarOperacao(multiplicao, 6, 5));

        Forma retangulo = new Retangulo(7, 8);
        System.out.println("Área de retângulo: " + retangulo.getArea());

        Forma quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + quadrado.getArea());
    }
}
