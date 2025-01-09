package src.exercicio3;

public class Retangulo implements Forma{
    private int base;
    private int altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return base * altura;
    }

}
