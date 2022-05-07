    package model;
    
    public class Motorcycle extends Vehicle implements GasolineConsume {
        
        private MotorcycleType motoType;

        private int tankCapacity;

        private double gasolineConsume;

        public Motorcycle(double base_price,String mark,String model, Double cilindercapacity, int kilometers, VehicleType type, String licensePlate, Documents [] documents,MotorcycleType motoType, int tankCapacity){

            super(base_price, mark, model, cilindercapacity, kilometers, type, licensePlate, documents );
            this.tankCapacity= tankCapacity;
            this.motoType = motoType;

        }

        @Override
        public double calculatesellprice() {
            
            double cost = base_price;

            double more = base_price*0.04;

            cost += more;

            if(documents[1] == null || documents[2] == null || documents[1].getYear()<2022 || documents[2].getYear()<2022){
                cost += 500000;
            }
            
            if(type == VehicleType.USED){
                double discont = base_price*0.02;
                cost -= discont;
            }

            return cost;
        }

        @Override
        public double gasolineConsume() {
            double out =  0;

            out = tankCapacity*(cilindercapacity/75);

            return out;
        }
    }
    