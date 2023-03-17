import java.util.Random;
public class Ratas {
    Ostja kasutaja;
    String firma;
    String mudel;
    int kaigud;
    int labisoit;
    public Ratas(String firma, String mudel, Ostja kasutaja){
        this.firma = firma;
        this.mudel = mudel;
        this.kasutaja = kasutaja;
    }
    public void setRatas(){
        Random random = new Random();
        this.kaigud = random.nextInt(28);
        this.labisoit = random.nextInt(10000);
        if (this.kaigud < 16) {
            System.out.println("Linnaratta käikude arv on:" + this.kaigud);
            System.out.println("Linnaratta läbisõit on:" + this.labisoit);
        } else {
            System.out.println("Käike on üle 16ne, tegemist on maastikurattaga.");
        }
        if (this.labisoit > 5000){
            uusRatas();
        }
    }
    private void uusRatas(){
        System.out.println("Ratas on päris tuus");
    }
    public void rattaKasutaja(){
        System.out.println(this.kasutaja.eesnimi + " " + this.kasutaja.perenimi);
    }

}
