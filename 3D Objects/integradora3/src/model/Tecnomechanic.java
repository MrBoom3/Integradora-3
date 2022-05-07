package model;

public class Tecnomechanic extends Documents {
    
    private double carGases;

    public Tecnomechanic(double price, int year, double carGases){
        super(price, year);
        this.carGases = carGases;
    }
    @Override
    public String decodification(){
        return "hola";
    }

    @Override
    public int getYear() {
        return super.getYear();
    }
}
