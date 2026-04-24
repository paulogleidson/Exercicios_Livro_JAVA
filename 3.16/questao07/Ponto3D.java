package questao07;

public class Ponto3D {
    private double x;
    private double y;
    private double z;

    public Ponto3D() {
        System.out.println("ponto criado, construtor1!");
    }

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("ponto criado, construtor2!");
    }

    public void translacao(Ponto3D obj) {
        this.x += obj.x;
        this.y += obj.y;
        this.z += obj.z;
        System.out.println("X:" + this.x + " Y: " + this.y + " Z: " + this.z);
    }

    public void translacao(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        System.out.println("X:" + this.x + " Y: " + this.y + " Z: " + this.z);
    }

    public static void main(String[] args) {
        Ponto3D p1 = new Ponto3D(0, 0, 0);
        Ponto3D p2 = new Ponto3D(1, 1, 1);

        p1.translacao(1, 4, 7);
        p1.translacao(p2);
    }
}