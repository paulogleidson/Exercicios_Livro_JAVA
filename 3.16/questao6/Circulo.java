package questao6;
/*Como nos exercícios 4 e 5, crie uma classe que represente uma
circunferência por meio de seu raio. Escreva um programa que leia um
valor de raio denfinido pelo usuário, instancie um objeto desse tipo e
exiba a área correspondente. */

public class Circulo {
    
    private double raio;
    private static final double pi = 3.14;
    
    Circulo() {
        System.out.println("Círculo criado!");
    }
    Circulo(double r) {
        this.raio = r;
    }

    public double getRaio() {
        return raio;
    }
    public double area() {
        double circArea = pi * (raio * raio);
        return circArea;
    } 



    public static void main(String[] args) {
        System.out.println(new Circulo(3).area());
    }
}