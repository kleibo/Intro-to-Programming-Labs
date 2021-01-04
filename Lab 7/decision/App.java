//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 7
// DUE: 2/25/19
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package decision;
public class App {
    public static void main(String[] args) {
        if(4 < 5){
            System.out.println("Four is less than Five");
        }else{
            System.out.println("Four is not less than Five");
        }
        int counter = 10;
        
        if(counter == 10){
            System.out.println("Counter is equal to 10");
        }
        
        double mixture = 23.5;
        if(mixture >= 23.5){
            System.out.println("Decrease Fuel Mixture by 0.30");
        }else if(mixture >= 23.0){
            System.out.println("Decrease Fuel Mixture by 0.10");
        }else if(mixture >= 22.5){
            System.out.println("Decrease Fuel Mixture by 0.05");
        }else if(mixture >= 21.0){
            System.out.println("Decrease Fuel Mixture is OK");
        }else if(mixture >= 20.0){
            System.out.println("Increase Fuel Mixture by 0.10");
        }else{
            System.out.println("Sensor needs to be checked");
        }
        String sensor = null;
        double fuelMixture = mixture;
        if(fuelMixture > 23){
            fuelMixture = (int)(mixture + 1);
        }else{
            fuelMixture = (int)(mixture);
        }
        
        switch ((int)fuelMixture){
            case 24:
                sensor = "Decrease Fuel Mixture by 0.30";
                break;
            case 23:
                sensor = "Decrease Fuel Mixture by 0.10";
                break;
            case 22:
                sensor = "Decrease Fuel Mixture by 0.05";
                break;
            case 21:
                sensor = "Decrease Fuel Mixture is OK";
                break;
            case 20:
                sensor = "Increase Fuel Mixture by 0.10";
                break;
        }
        System.out.println(sensor);
        
        int cookTime = 8;
        
        if(cookTime == 10){
            System.out.println("Cook time is 10 minutes");
        }else if(cookTime == 9){
            System.out.println("Cook time is 9 minutes");
        }else if(cookTime == 8){
            System.out.println("Cook time is 8 minutes");
        }else if(cookTime == 7){
            System.out.println("Cook time is 7 minutes");
        }else{
            System.out.println("Cook time is under 7 minutes");
        }//end if
    }
    
}
