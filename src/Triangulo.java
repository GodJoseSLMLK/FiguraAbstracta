public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        super("Triángulo");
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
        return (double) this.getBase() * this.getAltura() / 2;
    }
    
}
