public class Dieta {
    //attributi
    String tipo;
    int calorie;
    float pesoIdeal;
    boolean vegetariana;

    /* 
    public Dieta(String tipo, int calorie, float pesoIdeal, boolean vegetariana) {
        this.tipo = tipo;
        this.calorie = calorie;
        this.pesoIdeal = pesoIdeal;
        this.vegetariana = vegetariana;
    }*/

    //metodi
    void perditaPeso() {
        System.out.println("Seguendo la dieta " + tipo + ", si possono perdere peso mantenendo un apporto calorico di " + calorie + " calorie al giorno.");
    }

    void stampaCalorie() {
        System.out.println("La dieta " + tipo + " prevede un apporto calorico di " + calorie + " calorie al giorno.");
    }   

}