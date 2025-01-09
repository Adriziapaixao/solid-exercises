package src.exercicio3;

public class Main {

    public static void main(String[] args) {


        Forma retangulo = new Retangulo(7, 8);
        System.out.println("Área de retângulo: " + retangulo.getArea());

        Forma quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + quadrado.getArea());
    }
}
