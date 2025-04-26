public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, boolean esArea) {
        super(esArea);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcular() {
        if (esArea) {
            return base * altura;
        } else {
            return 2 * (base + altura);
        }
    }
}