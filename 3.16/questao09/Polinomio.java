package questao09;

/*Construa uma classe Polinomio para representar um polinômio de uma
variável, i.e., na forma y = anxn + an-1xn-1 + ... + a2x2 + a1x1 + a0. Inclua
na classe: (a) construtor Polinomio(int n) para indicar o grau n do
polinômio; (b) método void setCoef(int i, double v), para ajuste do i-
ésimo coeficiente com o valor; (c) método double getCoef(int i), para
retornar o i-ésimo coeficiente; (d) método double getY(double x), para
calcular o resultado do polinômio para um dado valor de x. Escreva
ainda um programa para testar a classe Polinomio construída. */

public class Polinomio {
    private double[] coeficientes;

    public Polinomio(int n) {
        coeficientes = new double[n + 1];
    }

    public void setCoef(int i, double v) {
        coeficientes[i] = v;
    }

    public double getCoef(int i) {
        return coeficientes[i];
    }

    public double getY(double x) {
        double resultado = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        //testando: y = 3x² + 2x + 5
        Polinomio p = new Polinomio(2);
        p.setCoef(0, 5); // a0 = 5
        p.setCoef(1, 2); // a1 = 2
        p.setCoef(2, 3); // a2 = 3

        System.out.println(p.getCoef(2));  //3.0
        System.out.println(p.getY(1));     //3+2+5 = 10.0
        System.out.println(p.getY(2));     //3*4+2*2+5 = 21.0
        System.out.println(p.getY(0));     //5.0
    }
}