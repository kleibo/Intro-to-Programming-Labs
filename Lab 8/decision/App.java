//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 8
// DUE: 4/1/19
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================

package decision;

public class App {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int x = 3;
        int y = 5;
        
        if(x < y && a == b){
            System.out.println("OK");
        }else{
            System.out.println("Not OK");
        }
        if(x < y && a != b){
            System.out.println("OK");
        }else{
            System.out.println("Not OK");
        }
        
        //HELPER CODE
        
        double x2 = 3.3293998;
        double y2 = 3.339222;
        
        final double EPSILON = 1E-3;
        if(Math.abs(x2 - y2)<= EPSILON){
            System.out.println("x is approximately equal to y");
        }else{
            System.out.println("x does not equal y");
        }
        
        
        
        String course1 =new String("COP2210");
        String course2 = new String("COP2211");
        
        if(course1.equals(course2)){
            System.out.println("Courses are the same");
        }else{
            System.out.println("Courses are not the same");
        }
        
        String single = "Yes";
        int income = 55000;
        String taxBracket;
        
        if(single == "Yes"){
            if(income <= 32000){
                taxBracket = "10% bracket";
            }else{
                taxBracket = "25% bracket";
            }
        }else{
            if(income <= 64000){
                taxBracket = "10% bracket";
            }else{
                taxBracket = "25% bracket";
            }
        }
        System.out.println("Person is in " + taxBracket);
    }   
}
