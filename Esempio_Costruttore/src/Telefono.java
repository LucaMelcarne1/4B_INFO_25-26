public class Telefono {
    String marca;
    String modello;
    int prezzo;
    

    public Telefono(){

    }
    public Telefono(String marca,String modello,int prezzo){
        this.marca=marca;
        this.modello=modello;
        this.prezzo=prezzo;
        System.out.println("Telefono inserito: "+marca +" "+modello+ " "+prezzo);
    }

    }
