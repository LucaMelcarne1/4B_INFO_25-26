public class Auto {
    //attributi
    String marca;
    String modello;
    int kmPercorsi;
    String colore;

    //costruttore con tutti i parametri
    public Auto(String marca, String modello, String colore, int kmPercorsi) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.kmPercorsi = kmPercorsi;
    }

    //costruttore vuoto
    public Auto() {
    }

    //metodi
    public void percorri(int km) {
        this.kmPercorsi += km;
    }
    public void accendi() {
        System.out.println("L'auto è accesa.");
    }

    public void spegni() {
        System.out.println("L'auto è spenta.");
    }

}
