public class App {
    public static void main(String[] args) throws Exception {
        //istanza classe Auto
        Auto car1= new Auto("Fiat","Panda","rossa",5); //oggetto auto
        //istanza classe Pilota
        Pilota pil1=new Pilota("Rossi","Mario",1990,true); //oggetto pilota
        car1.p=pil1;
        System.out.println("AUTO= "+car1.modello+" PILOTA= "+car1.p.cognome);
        car1.accendi();
        car1.percorri(50);
        car1.percorri(510);
        car1.spegni();
        System.out.println("km percorsi: "+ car1.kmPercorsi);
    }
}
