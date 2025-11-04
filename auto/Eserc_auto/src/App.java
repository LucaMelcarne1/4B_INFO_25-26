public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1= new Auto("Fiat","Panda","rossa",5);  
        auto1.accendi();
        auto1.percorri(50);
        auto1.percorri(510);
        auto1.spegni();
        System.out.println("km percorsi: "+ auto1.kmPercorsi);
    }
}
