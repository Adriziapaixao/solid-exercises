package src.exercicio1;

public class RelatorioFinanceiro {

    public static void main(String[] args){
        GerarRelatorio gerador = new GerarRelatorio();
        EnviarPorEmail enviador = new EnviarPorEmail();

        gerador.gerarRelatorio();

        enviador.enviarPorEmail();
    }
}
