public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado, boolean esArea) {
        super(esArea);
        this.lado = lado;
    }

    @Override
    public double calcular() {
        if (esArea) {
            return lado * lado;
        } else {
            return 4 * lado;
        }
    }
}