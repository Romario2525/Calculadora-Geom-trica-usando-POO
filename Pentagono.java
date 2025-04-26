public class Pentagono extends FiguraGeometrica {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema, boolean esArea) {
        super(esArea);
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcular() {
        if (esArea) {
            double perimetro = 5 * lado;
            return (perimetro * apotema) / 2;
        } else {
            return 5 * lado;
        }
    }
}