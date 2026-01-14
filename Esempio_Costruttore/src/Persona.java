public class Persona {
    String nome;
    String cognome;
    Telefono telefono;

    //costruttore vuoto
    public Persona(){

    }
    // Costruttore con tutti parametri
    public Persona(String nome, String cognome) {
        //il "this" indica l'oggetto corrente (quello che viene richiamato dal main)
        this.nome = nome; 
        this.cognome = cognome;
        System.out.println("Persona creata: " + nome + " " + cognome);
    }

    // Costruttore con tutti parametri + telefono
    public Persona(String nome, String cognome,Telefono telefono) {
        //il "this" indica l'oggetto corrente (quello che viene richiamato dal main)
        this.nome = nome; 
        this.cognome = cognome;
        this.telefono=telefono;
        System.out.println("Persona creata: " + nome + " " + cognome+" "+telefono.marca);
    }
    
    
}
