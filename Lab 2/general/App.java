//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 2
// DUE: 1/29/19
//
// CERTIFICATION: I certify that I Kyle Leibovitz this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================

package general;

public class App {

    public static void main(String[] args) {
        double principle = 10000.00;
        double year1Return = 0.05;
        double year2Return = 0.07;
        double year3Return = 0.02;
        double year4Return = -0.05;
        double year5Return = 0.11;
        
        double year1Value = principle*(1+year1Return);
        double year2Value = year1Value*(1+year2Return);
        double year3Value = year2Value*(1+year3Return);
        double year4Value = year3Value*(1+year4Return);
        double year5Value = year4Value*(1+year5Return);
        
        System.out.println("Principle =    " + principle);
        System.out.println("Year 1 Value = " + year1Value);
        System.out.println("Year 2 Value = " + year2Value);
        System.out.println("Year 3 Value = " + year3Value);
        System.out.println("Year 4 Value = " + year4Value);
        System.out.println("Year 5 Value = " + year5Value);
        
        double squareSideLength = 10.534;
        
        double squarePerimeter = 4*squareSideLength;
        double squareArea = squareSideLength*squareSideLength;
        
        System.out.println("\nShape Information");
        System.out.println("-------------------");
        System.out.println("Square");
        System.out.println("Height: \t" + squareSideLength);
        System.out.println("Width: \t\t" + squareSideLength);
        System.out.println("Perimeter: \t" + squarePerimeter);
        System.out.println("Area: \t\t" + squareArea);
        
        double length = 275.6421;
        double width = 55.23;
        
        double perimeter = 2*length + 2*width;
        double area = length*width;
        
        System.out.println("\nRectangle");
        System.out.println("Length: \t" + length);
        System.out.println("Width: \t\t" + width);
        System.out.println("Perimeter: \t" + perimeter);
        System.out.println("Area: \t\t" + area);
        
        double A = 30.0;
        double B = 50.0;
        double C = Math.pow((A*A + B*B), 0.5);
        
        double trianglePerimeter = A + B + C;
        double triangleArea = A*B*0.5;
        
        System.out.println("\nTriangle");
        System.out.println("Triangle Height: \t" + A);
        System.out.println("Triangle Length: \t" + B);
        System.out.println("Triangle Hypotenuse: \t" + C);
        System.out.println("Perimeter: \t\t" + trianglePerimeter);
        System.out.println("Area: \t\t\t" + triangleArea);
        
        double diameter = 20.562;
        double radius = diameter/2;
        double circleArea = Math.PI*radius*radius;
        double circumference = 2*radius*radius;
        
        System.out.println("\nCircle");
        System.out.println("Diameter: " + diameter);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circumference);
        
        double cylinderDiameter = 40.43;
        double cylinderRadius = cylinderDiameter/2;
        double cylinderArea = Math.pow(cylinderRadius, 2)*Math.PI;
        double cylinderHeight = 120.54;
        double cylinderCircumference = 2*Math.PI*cylinderRadius;
        double surfaceArea = Math.PI*cylinderRadius*cylinderHeight + 2*cylinderArea;
        double cylinderVolume = cylinderCircumference*cylinderHeight;
        
        System.out.println("\nCylinder");
        System.out.println("Cylinder Diameter: " + cylinderDiameter);
        System.out.println("Cylinder Radius: " + cylinderRadius);
        System.out.println("Cylinder Circumference: " + cylinderCircumference);
        System.out.println("Cylinder Surface Area: " + surfaceArea);
        System.out.println("Cylinder Volume: " + cylinderVolume);
    }
}