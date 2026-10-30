public class Circulo extends Figura {
    private int radio;

    public Circulo(int radio) {
        super("Círculo");
        this.setRadio(radio);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
}
