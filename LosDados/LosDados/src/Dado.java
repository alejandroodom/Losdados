import java.util.Random;
public class Dado {
    private int numCaras;
    private int ultCara;

    public Dado() {
        this.numCaras = 6;
    }

    public Dado(int numCaras) {
        this.numCaras = numCaras;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public int getUltCara() {
        return ultCara;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    public int tirar() {
        Random r = new Random();
        ultCara = r.nextInt(numCaras) + 1;
        return ultCara;
    }
}
