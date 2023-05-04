import java.util.Arrays;

public class Kinnisvara {

    String linn;
    int hind;
    double pindala;
    String piirkond;

    public Kinnisvara(String linn, int hind, double pindala, String piirkond) {
        this.linn = linn;
        this.hind = hind;
        this.pindala = pindala;
        this.piirkond = piirkond;
    }

    Kinnisvara kinnisvara = new Kinnisvara("Tallinn", 559, 31, "Kirstiine");

    public String getLinn() {
        return linn;
    }

    public int getHind() {
        return hind;
    }

    public double getPindala() {
        return pindala;
    }

    public String getPiirkond() {
        return piirkond;
    }

    public void setLinn(String linn) {
        this.linn = linn;
    }

    public void setHind(int hind) {
        this.hind = hind;
    }

    public void setPindala(double pindala) {
        this.pindala = pindala;
    }

    public void setPiirkond(String piirkond) {
        this.piirkond = piirkond;
    }

    @Override
    public String toString() {
        return "Kinnisvara{" +
                "linn='" + linn + '\'' +
                ", hind=" + hind +
                ", pindala=" + pindala +
                ", piirkond=" + piirkond +
                '}';
    }
}