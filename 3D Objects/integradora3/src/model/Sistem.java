package model;

import java.util.ArrayList;

    public class Sistem{

        private String hola;

        private ArrayList<Vehicle>vehicles;

        public Sistem(String hola){
            this.hola = hola;
            vehicles = new ArrayList<Vehicle>();
        }

        public String addMotocycle(double base_price,String mark,String model, double cilinderCapacity, int kilometers, int type, String licensePlate,int motoType, int tankCapacity,double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){

            String out=""; 


            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            MotorcycleType typeMoto = null;

            switch(motoType){
                case 1 :
                    typeMoto = MotorcycleType.ESTANDAR;
                break;
                case 2 :
                    typeMoto = MotorcycleType.SPORT;
                break;
                case 3 :
                    typeMoto = MotorcycleType.SCOOTER;
                break;
                case 4 :
                    typeMoto = MotorcycleType.CROSS;
                break;
            }

           // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }


           Motorcycle aMoto = new Motorcycle(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate, documents, typeMoto, tankCapacity);

            vehicles.add(aMoto);
            out = " The Moto was succesfully registered!";

            return out;

        }
        
        
       
        public boolean proveType(int type){

            boolean out = false;

            if(type != 0){
                if(type == 1 || type == 2){
                    out = true;
                }
            }
            return out;
        }

        public boolean proveMotoType(int motoType){
            
            boolean out = false;

            if(motoType!=0){
                if(motoType == 1 || motoType == 2 || motoType == 3 || motoType==3){
                    out = true;
                }
            }
            return out;

        }

        public String addGasCar(double base_price,String mark,String model, double cilinderCapacity, int kilometers, int type, String licensePlate,int carType, int numDoors, boolean polarice,int gasType, int tankCapacity, double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){

            String out=""; 

            

            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            CarType typeCar = null;

            switch(carType){
                case 1 :
                    typeCar = CarType.SEDAN;
                break;
                case 2:
                    typeCar = CarType.TRUCK;
                break;
            }

            GasolineType gas = null;

            switch(gasType){
                case 1:
                    gas = GasolineType.DIESEL;
                break;
                case 2 :
                    gas = GasolineType.PREMIUM_GAS;
                break;
                case 3:
                    gas = GasolineType.REGULAR_GAS;
                break;

            }

            // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }

            GasolineCar aCar = new GasolineCar(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate,documents , typeCar, numDoors, polarice, gas, tankCapacity);
            vehicles.add(aCar);
             out = "The car was successfully registered!";
            return out;
        }

        public String addElectricCar(double base_price,String mark,String model, double cilinderCapacity, int kilometers, int type, String licensePlate,int carType, int numDoors, boolean polarice,int charger, double batteryDuration,double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){
            
            String out = "";

        
            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            CarType typeCar = null;

            switch(carType){
                case 1 :
                    typeCar = CarType.SEDAN;
                break;
                case 2:
                    typeCar = CarType.TRUCK;
                break;
            }

            ChargerType typeCharger = null;

            switch(charger){
                case 1:
                    typeCharger = ChargerType.FAST;
                break;
                case 2:
                    typeCharger = ChargerType.NORMAL;
                break;
            }


            // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }

            ElectricCar aElectric = new ElectricCar(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate, documents, typeCar, numDoors, polarice, typeCharger, batteryDuration);

            vehicles.add(aElectric);

            out = "The Electric car was successfully registered!";
                
            return out;

        }

        public String addHybridCar(double base_price,String mark,String model, Double cilinderCapacity, int kilometers, int type, String licensePlate,int carType, int numDoors, boolean polarice,int gasType, int tankCapacity,int charger, double batteryDuration,double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){

            String out = "";


            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            CarType typeCar = null;

            switch(carType){
                case 1 :
                    typeCar = CarType.SEDAN;
                break;
                case 2:
                    typeCar = CarType.TRUCK;
                break;
            }

            ChargerType typeCharger = null;

            switch(charger){
                case 1:
                    typeCharger = ChargerType.FAST;
                break;
                case 2:
                    typeCharger = ChargerType.NORMAL;
                break;
            }

            GasolineType gas = null;

            switch(gasType){
                case 1:
                    gas = GasolineType.DIESEL;
                break;
                case 2 :
                    gas = GasolineType.PREMIUM_GAS;
                break;
                case 3:
                    gas = GasolineType.REGULAR_GAS;
                break;

            }

            // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }

            HybridCar aHybridCar = new HybridCar(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate, documents, typeCar, numDoors, polarice, gas, tankCapacity, typeCharger, batteryDuration);
            
            vehicles.add(aHybridCar);

            out = "The hybrid car was seccessfully registered";

            return out;
        }
    }

        
    