package model;

public class GasolineCar extends Car implements GasolineConsume {
    
    private GasolineType gasType;

    private double tankCapacity;

    private double gasolineConsume;

    public GasolineCar(double base_price,String mark,String model, double cilindercapacity, int kilometers, VehicleType type, String licensePlate, Documents [] documents,CarType carType, int numDoors, boolean polarice,GasolineType gasType, int tankCapacity){

        super(base_price, mark, model, cilindercapacity, kilometers, type, licensePlate, documents, carType, numDoors, polarice);
        this.tankCapacity = tankCapacity;
        this.gasType = gasType;

    }

    @Override
    public double calculatesellprice(){
       return super.calculatesellprice();
    }

    @Override
    public double gasolineConsume(){
        double out = tankCapacity*(cilindercapacity/150);
        return out;
    }



}
