//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 6
// DUE: 2/26/19
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================

package central;

import mathhelper.ComplexCalculator;

public class App {

    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        double principle = 1000;
        double interestRate = 0.05;
        int years = 5;
        double futureValue = ComplexCalculator.futureValue(principle, interestRate, years);
        
        System.out.printf("Future Value = %.2f\n", futureValue);
        
        double areaOfCircle = ComplexCalculator.areaOfCircle(12.75);
        
        System.out.printf("Area of Circle = %8.4f \n", areaOfCircle);
        
        double roundedExpValue = ComplexCalculator.round(Math.E,7);
        
        System.out.println("Rounded Value of Exp = " + roundedExpValue);
        
        double result = ComplexCalculator.crazyEquation();
        
        System.out.println("Crazy Equation = " + result);
        
        
        }
    }
    
