package model;

public abstract class Documents {
    
    private double price;

    private int year;

    protected int IMAGE = 4;

    protected int [][] image;

    public Documents(double price,int year){

        this.price = price;
        this.year = year;
        image = new int [IMAGE][IMAGE];

        for(int i = 0;i<IMAGE;i++){
            for(int count = 0;i<IMAGE;count++){
                image[i][count] = (int)(Math.random()*(10));
            }
        }

    }

    public abstract String decodification();

    public int getYear() {
        return year;
    }

    public double getPrice(){
        return price;
    }
}
