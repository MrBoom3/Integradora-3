package ui;

import model.Sistem;
import java.util.Scanner;
   
public class Main{

        private Sistem sistem;

        private Scanner sc;

        public Main(){
            sistem = new Sistem("Hello");
            sc = new Scanner(System.in);
        }

        public static void main (String [] a){

            System.out.println("Start the app");
		
		    Main ppal= new Main();
		
		    int option=0;


            do{
                option= ppal.showMenu();
                ppal.executeOperation(option);
                
            }while (option!=0);
            
        }
        
        public int showMenu() {
            int option=0;
    
            System.out.println(
                "Select an option:\n" +
                "(1) Register a Vehicle\n" +
                "(2) To create the rectangle\n"+
                "(3) To create the circle \n"+
                "(4) To show the figures\n" +
                "(0) To exit"
                    );
            option= sc.nextInt();
            sc.nextLine();
            return option;
        }
        
        public void executeOperation(int operation) {
            
            switch(operation) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                defaultVehicle() ;
                break;
            case 2:
                
                break;
        
            case 3:
                
                break;
    
            case 4:
                
                break;
            
            default:
                System.out.println("Error, opción no válida");
            
            }
        }
        

        public void defaultVehicle(){

            double price;
            System.out.println("Introduction the base price of the vehicle :");
            price = sc.nextDouble();
            sc.nextLine();

            String brand;
            System.out.println("Inser the brand of the vehicle :");
            brand=sc.nextLine();

            String model;
            System.out.println("Introduction the model year of the vehicle :");
            model = sc.nextLine();

            double cilinder;
            System.out.println("Introduction the cilinder capacity of the vehicle :");
            cilinder = sc.nextDouble();
            sc.nextLine();

            int kilometers;
            System.out.println("Introduction the kilometers of the vehicle(If the vehicle is new Introduction 0) :");
            kilometers = sc.nextInt();
            sc.nextLine();

            int isNew;
            do{
            System.out.println("The vehicle is new or used? (1) new and (2) Used :");
            isNew = sc.nextInt();
            sc.nextLine();

                 if(isNew != 1 || isNew !=2){
                    System.out.println("Invalid value");
                 }

            }while(isNew ==1 || isNew ==2);

            String plate;
            if(isNew == 1){
                plate = "";
            }else{
                System.out.println("Introduction the licensePlate:");
                plate = sc.nextLine();
            }
            
            double soatPrice;
            int soatYear;
            double coverage;
            boolean soat = false; 
            if(isNew == 2){

                System.out.println("The vehicle have Soat? (true or false) :");
                soat = sc.nextBoolean();
                sc.nextLine();
                if(soat == false){
                    soatPrice =-1;
                    soatYear = -1;
                    coverage = -1;
                }else{
                    System.out.println("Introduction the price of the soat:");
                    soatPrice=sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Introduction the year of the soat :");
                    soatYear = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduction the coverage of the soat:");
                    coverage =sc.nextDouble();
                    sc.nextLine();
                }
            
            }


            double tecnoPrice;
            int tecnoYear;
            double tecnoGases;
            boolean tecno = false; 
            System.out.println("The vehicle have tecnomecanic? (true or false) :");
            soat = sc.nextBoolean();
            sc.nextLine();
            if(tecno == false){
                tecnoPrice =-1;
                tecnoYear = -1;
                tecnoGases= -1;
            }else{
                System.out.println("Introduction the price of the tecnomecanic:");
                tecnoPrice=sc.nextDouble();
                sc.nextLine();
                System.out.println("Introduction the year of the tecnomecanic :");
                tecnoYear = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduction the car gases of the tecnomecanic:");
                sc.nextDouble();
                sc.nextLine();
            }

            double properprice;
            int properyear;
            boolean property = false; 
            if(isNew == 1){
                property = false;
            }
            if(property == false){
                properprice =-1;
                properyear = -1;
            }else{
                System.out.println("The car is used so... ");
                System.out.println("Introduction the price of the soat:");
                properprice=sc.nextDouble();
                sc.nextLine();
                System.out.println("Introduction the year of the soat :");
                properyear = sc.nextInt();
                sc.nextLine();
            }
            int option;
            System.out.println("Introduction what type of vehicle you want to register \n (1) Motocicle \n (2)Gas car \n (3) Electric car \n  (4) Hybrid car");
            option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1 :
                    registermoto(price,brand,model,cilinder,kilometers,isNew,plate,soatPrice,soatYear,coverage,tecnoPrice,tecnoYear,tecnoGases,properprice,properyear);
                    break;
                case 2:
                    registergascar(price,brand,model,cilinder,kilometers,isNew,plate,soatPrice,soatYear,coverage,tecnoPrice,tecnoYear,tecnoGases,properprice,properyear);
                    break;
                case 3:
                    registerelectriccar(price,brand,model,cilinder,isNew,plate,soatPrice,soatYear,coverage,tecnoPrice,tecnoYear,tecnoGases,properprice,properyear);
                    break;
                case 4:
                    registerhybridCar(price,brand,model,cilinder,isNew,plate,soatPrice,soatYear,coverage,tecnoPrice,tecnoYear,tecnoGases,properprice,properyear);
                    break;
                default:
                System.out.println("invalid option.");
                    break;
            }




        }
       
        public void registermoto(double price, String brand, String model, double cilinder, int kilometers, int isNew, String plate,double soatPrice, int soatYear, double coverage,double tecnoPrice,int tecnoYear,double tecnoGases,double properprice,int properyear){

            int motoType;
            System.out.println("Introduction the moto type \n (1) Estandar \n (2) Sport \n (3) Scooter \n (4) Cross ");
            motoType = sc.nextInt();
            sc.nextLine();

            int tank;
            System.out.println("Introduction the tank capacity of the moto:");
            tank = sc.nextInt();
            sc.nextLine();

            System.out.println(sistem.addMotocycle(price,brand, model, cilinder, kilometers, isNew, plate, motoType, tank, soatPrice, soatYear, coverage, tecnoPrice, tecnoYear, tecnoGases, properprice, properyear));


        }

        public void registergascar(double price, String brand, String model, double cilinder, int kilometers, int isNew, String plate,double soatPrice, int soatYear, double coverage,double tecnoPrice,int tecnoYear,double tecnoGases,double properprice,int properyear){

        }


        
    }