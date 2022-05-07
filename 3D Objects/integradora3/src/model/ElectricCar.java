package model;

public class ElectricCar extends Car implements BatteryConsume {
    
    private ChargerType charger;

    private double batteryDuration;

    private double batteryConsume;

    public ElectricCar(double base_price,String mark,String model, double cilindercapacity, int kilometers, VehicleType type, String licensePlate, Documents [] documents,CarType carType, int numDoors, boolean polarice,ChargerType charger, double batteryDuration ){

        super(base_price, mark, model, cilindercapacity, kilometers, type, licensePlate, documents, carType, numDoors, polarice);
        this.charger = charger;
        this.batteryDuration = batteryDuration;

    }


    @Override
    public double calculatesellprice(){
       double cost = super.calculatesellprice();
       
       double elecMore = base_price*0.2;
       
       cost += elecMore;
       
        return cost;
    }

    @Override
    public double batteryConsume(){
        double out = 0;

        if(charger == ChargerType.FAST){
            out = (batteryDuration+13)*(cilindercapacity/100);
        }
        if(charger == ChargerType.NORMAL){
            out = (batteryDuration+18)*(cilindercapacity/100);
        }

        return out;

    }

}
