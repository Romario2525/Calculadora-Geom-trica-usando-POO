public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio, boolean esArea) {
        super(esArea);
        this.radio = radio;
    }

    @Override
    public double calcular() {
        if (esArea) {
            return Math.PI * radio * radio;
        } else {
            return 2 * Math.PI * radio;
        }
    }
}