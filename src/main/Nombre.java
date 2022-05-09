package main;

public class Nombre {
    private final int valeurNombre;

    public Nombre(int nb){
        this.valeurNombre = nb;
    }

    public int valeur(){
        return this.valeurNombre;
    }

    @Override
    public String toString() {
        return "Le nombre est " + this.valeurNombre ;
    }
}
