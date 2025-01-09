package src.exercicio4;

public class Main {

    public static void main(String[] args){

        Atendente atendente = new Atendente();
        Desenvolvedor programador = new Programador();

        programador.Programar();
        atendente.atenderCliente();
    }
}
