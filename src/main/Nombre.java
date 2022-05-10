package main;

public class Nombre extends Expression{
    private final int valeurNombre;

    public Nombre(int nb){
        this.valeurNombre = nb;
    }

    public double valeur(){
        return this.valeurNombre;
    }

    @Override
    public String toString() {
        return "Le nombre est " + this.valeurNombre ;
    }
}
