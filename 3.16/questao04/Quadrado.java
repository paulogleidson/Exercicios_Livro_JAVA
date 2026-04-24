package questao04;
/*4. Dada a classe Quadrado a seguir, construa um programa que instancie um
objeto desse tipo, fazendo com que a medida do seu lado seja 1.5. Exiba
a área do objeto criado, com uso do método area() dessa classe.*/

public class Quadrado {
    private double lado;
    public void setLado(double l) {
        if(l<0) throw new RuntimeException("Lado invalido");
        lado = l;
    }
    public double area() { 
        return lado*lado;
    }


    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(1.5);
        System.out.println("Área do quadrado 1: " + quadrado1.area());
    }
}
