public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Circulo(3));
        polimorfismo(new Cuadrado(4));
        polimorfismo(new Rectangulo(5, 6));
        polimorfismo(new Triangulo(7, 8));
        polimorfismo(new Rombo(9, 10));
    }

    public static void polimorfismo(Figura MiFigura) throws Exception {
        System.out.println("Área: " + MiFigura.calcularArea());
        System.out.println("tipo: " + MiFigura.getTipo());
    }
}
