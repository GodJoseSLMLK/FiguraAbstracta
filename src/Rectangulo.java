public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        super("Rectángulo");
        this.setBase(base);
        this.setAltura(altura);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (double) this.getBase() * this.getAltura();
}
}
