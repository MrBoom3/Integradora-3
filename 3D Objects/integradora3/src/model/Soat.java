package model;

public class Soat extends Documents {
    
    private double coverage;

    public Soat(double price, int year, double coverage){
        super(price, year);
        this.coverage = coverage;
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

