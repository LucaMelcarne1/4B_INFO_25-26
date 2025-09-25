public class Persona {
    String nome;
    int eta;
    String sesso;
    String coloreCapelli;
    boolean sposato;

    /*public Persona(String nome, int eta, String sesso, String coloreCapelli, boolean sposato) {
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.coloreCapelli = coloreCapelli;
        this.sposato = sposato;
    } */
    

    //metodo
    public void parla() {
        System.out.println("Ciao, come stai?");
    }
    public static void saluta() {
        System.out.println("Salve!");
    }

}
