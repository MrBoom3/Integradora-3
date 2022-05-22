package model;

public abstract class Vehicle {

    protected double base_price;

    protected double sellPrice;

    protected String mark;

    protected int model;

    protected double cilinderCapacity;

    protected int kilometers;

    protected VehicleType type;

    protected String licensePlate;

    protected Documents [] documents;


        public Vehicle(double base_price,String mark,int model, double cilinderCapacity, int kilometers, VehicleType type, String licensePlate, Documents [] documents ){
            this.base_price = base_price;
            this.mark = mark;
            this.model = model;
            this.cilinderCapacity = cilinderCapacity;
            this.kilometers = kilometers;
            this.type = type;
            this.licensePlate = licensePlate;
            this.documents = documents;
        }

        public abstract double calculateSellPrice();

        public String toString(){
            return  "Base price : " + base_price + 
            "\n Brand : " + mark + 
            "\n Model : " + model +
            "\n Cilinder capacity :" + cilinderCapacity +
            "\n kilometers : " + kilometers +
            "\n The car is :" + type +
            "\n License plate = " + licensePlate +
            "\n\n Documents list : " + "\n\n" + docuString() + "\n \n";
        }

        public String docuString(){
            String out = "";
            for(int i = 0;i<3;i++){
                
                if(documents[i] !=null){
                out += documents[i].toString();
                }
            }
            return out;
        }

        public VehicleType getVehicleType(){
            return this.type;
        }
        public String reportDocu(){
            String out = "Report Documents";
            
            for(int i = 0;i<3;i++){
               
                if(documents[i] !=null){
                    out += documents[i].toString();

                     if(documents[i].getYear() != 2022){
                        out += "STATUS :\u001B[31m Expired \u001B[0m";
                    }else{
                        out += "STATUS: in order";
                    }
                }else{
                    if(i == 0){
                        out += "\n SOAt STATUS: no registered \n";
                    }
                    if(i == 1){
                        out += "TECNOMECHANIC STATUS: no registered \n";
                    }
                    if(i == 2){
                        out += "\n PROPERTY CARD STATUS: no registered \n";
                    }
                }
            }
            return out;
        }

        public int getModel(){
            return this.model;
        }

       
    
}
