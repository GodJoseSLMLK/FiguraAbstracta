public class Rombo extends Figura {
    private int diagonalMayor;
    private int diagonalMenor;

    public Rombo(int diagonalMayor, int diagonalMenor) {
        super("Rombo");
        this.setDiagonalMayor(diagonalMayor);
        this.setDiagonalMenor(diagonalMenor);
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (double) this.getDiagonalMayor() * this.getDiagonalMenor() / 2;
    }
}
