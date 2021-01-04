//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Final 
// DUE: 4/19/19
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package project;

import matrix.MatrixArray;
import util.ArrayUlit;

public class App {

    public static void main(String[] args) {
        int[] rnds = ArrayUlit.createRandomArray(15,100);

            System.out.println("15 Elements of the random Array");
            System.out.println("---------------------------------------------------------");
            ArrayUlit.printArray(rnds);
            System.out.println("\n---------------------------------------------------------");
            System.out.println("");

            System.out.println("Array Sum = " + ArrayUlit.getSum(rnds));
            System.out.println("Array Average = " + ArrayUlit.getAverage(rnds));
            System.out.println("Array Elements below the Average = " +
            ArrayUlit.numBelowAverage(rnds));
            System.out.println("Array Maximum = " + ArrayUlit.getMaximum(rnds));
            System.out.println("Array Minimum = " + ArrayUlit.getMinimum(rnds));

            System.out.println("\n\n");


            System.out.println("----------------------------------------------------------");
            System.out.println("Elements of a 10x10 MatrixArray");
            System.out.println("----------------------------------------------------------");


            MatrixArray matrixArray = new MatrixArray(10,10);
            matrixArray.consolePrint();
            System.out.println("Sum of Matrix = " + matrixArray.getSum());
            System.out.println("Average of Matrix = " + matrixArray.getAverage());
            System.out.println("---------------------------------------------------------");
            System.out.println("\n");


            matrixArray.changeEvenColsPattern();
            matrixArray.consolePrint();
            System.out.println("Sum of Matrix = " + matrixArray.getSum());
            System.out.println("Average of Matrix = " + matrixArray.getAverage());
            System.out.println("---------------------------------------------------------");
            System.out.println("\n");

            matrixArray.changeAllEvenPattern();
            matrixArray.consolePrint();
            System.out.println("\nSum of Matrix = " + matrixArray.getSum());
            System.out.println("Average of Matrix = " + matrixArray.getAverage());
            System.out.println("---------------------------------------------------------");
            System.out.println("\n");

    }
    
}