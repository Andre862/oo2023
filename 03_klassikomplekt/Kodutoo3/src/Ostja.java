import java.util.Date;
public class Ostja {
    Ratas ratas;
    String kasutajanimi;
    String parool;
    String email;
    String eesnimi;
    String perenimi;
    boolean aktiivne;
    Date ostmisAeg;
    Date muumisAeg;

    public Ostja(String kasutajanimi, String parool, String email, String eesnimi, String perenimi){
        this.kasutajanimi = kasutajanimi;
        this.parool = parool;
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aktiivne = true;
        this.ostmisAeg = new Date();
        this.muumisAeg = null;
    }

    public String ratasMuudud(){
        this.aktiivne = false;
        this.muumisAeg = new Date();
        return "Ratas on müüdud."; // kuna on mingisugune tagastus, siis peab selle salvestama muututjasse, kui func välja kutsutakse
    }

    public void muudaParool(String uusParool){
        this.parool= parool;
        System.out.println("Parool muudetud!");
    }
}
