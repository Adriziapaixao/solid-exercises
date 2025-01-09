package src.exercicio2;


public class Calculadora {

    public int executarOperacao(Operacao operacao, int a, int b) {
        return operacao.calcular(a, b);
    }
}
