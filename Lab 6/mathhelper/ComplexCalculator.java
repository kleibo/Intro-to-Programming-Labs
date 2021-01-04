package mathhelper;
public class ComplexCalculator {

public static final double VERSION = 1.0;
 
 public ComplexCalculator(){
     System.out.println("-------------------------------------------------------");
     System.out.println("Complex Calculator is setting up... running version: " + VERSION);
     System.out.println("-------------------------------------------------------");
     System.out.println("");
 }

 public static double futureValue(double principle, double interestRate, int years){
     double futureValue;
     futureValue = principle * Math.pow(1+interestRate, years);
     return futureValue;
 }
 
 public static double areaOfCircle(double radius){
     double area = Math.PI*Math.pow(radius, 2);
     return area;
 }
 
 public static double round(double value, int roundTo){
     double multiplier = Math.pow(10, roundTo);
     
     double resultValMult = value * multiplier;
     
     double resultRoundOfValMult = Math.round(resultValMult);
     
     double finalResult = resultRoundOfValMult/multiplier;
     
     return finalResult;
 }
 
 public static double crazyEquation(){
     double result = ((100/Math.sqrt(18))*200+Math.pow(2.1, 3))/(2 + Math.log10(6)*Math.pow(2.15,3));
     return result;
 }
 
} 