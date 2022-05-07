package model;

public class PropertyCard extends Documents {
    

    public PropertyCard(double price, int year){
        super(price, year);
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
