package model;

public abstract class Car extends Vehicle {
    

    private CarType cartype;

    private int numDoors;

    private boolean polarice;

    public Car(double base_price,String mark,String model, double cilindercapacity, int kilometers, VehicleType type, String licensePlate, Documents [] documents,CarType carType, int numDoors, boolean polarice){

        super(base_price, mark, model, cilindercapacity, kilometers, type, licensePlate, documents);
        this.numDoors = numDoors;
        this.polarice = polarice;

    }

    @Override
    public double calculatesellprice() {
       
        double cost = base_price;

        if(documents[1] == null || documents[2] == null || documents[1].getYear()<2022 || documents[2].getYear()<2022){
            cost += 500000;
        }
        
        if(type == VehicleType.USED){
            double discont = base_price*0.1;
            cost -= discont;
        }

        return cost;
    }

}
