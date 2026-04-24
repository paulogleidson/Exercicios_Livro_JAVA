package questao10;
import java.util.Scanner;
 /*10 Escreva um programa capaz de criar vários objetos Retangulo3
(Exemplo 3.10) correspondentes às diversas salas retangulares de uma
construção. O usuário do programa deve indicar, inicialmente, o
número de salas existentes, fornecendo depois as medidas de cada sala.
O programa deve então calcular e exibir a área total de todas as salas. */

public class Retangulo {
    private int largura;
    private int comprimento;

    Retangulo() {}
    Retangulo(int l, int c) {
        this.largura = l;
        this.comprimento = c;
    }

    public int area() {
        return this.largura * this.comprimento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quatidade de salas: ");
        int totalSalas = sc.nextInt();
        Retangulo salas[] = new Retangulo[totalSalas];

        for (int i = 0; i < salas.length; i++) {
            System.out.println("Digite a largura: ");
            int l = sc.nextInt();
            System.out.println("Digite o comprimento: ");
            int c = sc.nextInt();

            Retangulo rt = new Retangulo(l, c);
            salas[i] = rt;
        }

        int totalArea = 0;
        for (int i = 0; i < salas.length; i++) {
            totalArea += salas[i].area();
        }
        System.out.println("Área total: " + totalArea);
        
        sc.close();
    }
}
