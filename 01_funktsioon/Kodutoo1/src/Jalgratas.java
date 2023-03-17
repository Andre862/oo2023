public class Jalgratas {
    String firma;
    String mudel;
    int hobuJoud;
    char kasutajaSugu;

    public Jalgratas(String firma, String mudel, int hobuJoud, char kasutajaSugu){
        this.firma = firma;
        this.mudel = mudel;
        this.hobuJoud = hobuJoud;
        this.kasutajaSugu = kasutajaSugu;
    }

    public void setJalgratas(){
        System.out.println("Jalgratta firma on: "+firma);
    }
    public void kiiverJalgratas(){
        if(this.kasutajaSugu == 'M'){
            System.out.println("Soovitame teile kiivrit suuruses L-XXl ");
        } else if (this.kasutajaSugu == 'N') {
            System.out.println("Soovitame teile kiivrit suureuses XS-M");
        } else {
            System.out.println("Kuna meie ei tea teie sugu, kasutage seda kiivrit mis kõige mugavamini peas istub");
        }
    }
}
