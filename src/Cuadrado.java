public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado) {
        super("Cuadrado");
        this.setLado(lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (double) this.getLado() * this.getLado();
    }
    
}
