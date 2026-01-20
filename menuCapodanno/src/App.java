public class App {
    public static void main(String[] args) throws Exception {
        //menu di carne
        Menu mC=new Menu("carne", "mix di carne", 
        "pasta al ragù", "bistecca", 30);

        //menu di pesce
        Menu mP=new Menu("pesce", "antipasto di mare", 
        "pasta con le vongole", "tonno alla griglia", 
        40);
        
        //menu vuoto
        Menu mV=new Menu();
        mV.tipo="misto";
        mV.antipasto="mix di verdure";
        mV.primo="carbonara";
        mV.secondo="frittura mista";
        mV.prezzo=50;

        //ristorante 1
        Ristorante r1= new Ristorante("Ristorante Turco", 
        "Tricase", "333333", mC);

        //ristorante 2
        Ristorante r2= new Ristorante("Ristorante Casciaro", 
        "Leuca", "3213312", mP);

        //ristorante 3
        Ristorante r3= new Ristorante("Ristorante Alemanno", 
        "Gallipoli", "3331233", mV);

        //nel ristorante di Marina c'è il menu vuoto
        









    }
}
