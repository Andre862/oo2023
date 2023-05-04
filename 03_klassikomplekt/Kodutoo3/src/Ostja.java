import java.util.Date;
public class Ostja {
    Ratas ratas;
    String kasutajanimi;
    String parool;
    String email;
    String eesnimi;
    String perenimi;
    boolean aktiivne;
    Date loomisAeg;
    Date kustutamisAeg;

    public Ostja(String kasutajanimi, String parool, String email, String eesnimi, String perenimi){
        this.kasutajanimi = kasutajanimi;
        this.parool = parool;
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aktiivne = true;
        this.loomisAeg = new Date();
        this.kustutamisAeg = null;
    }

    public String kustutaKasutaja(){
        this.aktiivne = false;
        this.kustutamisAeg = new Date();
        return "Kasutaja kustutatud."; // kuna on mingisugune tagastus, siis peab selle salvestama muututjasse, kui func välja kutsutakse
    }

    public void muudaParool(String uusParool){
        this.parool= parool;
        System.out.println("Parool muudetud!");
    }
}
