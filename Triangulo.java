public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangulo(double base, double altura) {
        super(true);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        super(false);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcular() {
        if (esArea) {
            return (base * altura) / 2;
        } else {
            return lado1 + lado2 + lado3;
        }
    }
}