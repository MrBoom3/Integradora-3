package model;

public abstract class Vehicle {

    protected double base_price;

    protected double sellprice;

    protected String mark;

    protected String model;

    protected double cilindercapacity;

    protected int kilometers;

    protected VehicleType type;

    protected String licenseplate;

    protected Documents [] documents;


        public Vehicle(double base_price,String mark,String model, double cilindercapacity, int kilometers, VehicleType type, String licenseplate, Documents [] documents ){
            this.base_price = base_price;
            this.mark = mark;
            this.model = model;
            this.cilindercapacity = cilindercapacity;
            this.kilometers = kilometers;
            this.type = type;
            this.licenseplate = licenseplate;
            this.documents = documents;
        }

        public abstract double calculatesellprice();
    
}
