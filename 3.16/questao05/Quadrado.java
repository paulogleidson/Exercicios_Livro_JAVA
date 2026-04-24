package questao05;
/*Modique a classe Quadrado (Exercício 4) de modo que possua um
construtor default e outro parametrizado com o valor inicial do lado.
Altere também o programa criado no exercício 4 para utilizar o novo
construtor parametrizado.*/

public class Quadrado {
    private double lado;

    public Quadrado() {
        System.out.println("Novo quadrado criado!!");
    }
    public Quadrado (double ld) {
        this.lado = ld;
    }
    public void setLado(double l) {
        if(l<0) throw new RuntimeException("Lado invalido");
        lado = l;
    }
    public double area() { 
        return lado*lado;
    }


    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(1.5);
        System.out.println("Área do quadrado 1: " + quadrado1.area());
    }
}
