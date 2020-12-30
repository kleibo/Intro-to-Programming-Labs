//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 3
// DUE: 2/4/19
//
// CERTIFICATION: I certify that I Kyle Leibovitz this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================



package components;

import javax.swing.JFrame;

public class CarViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CarComponent component = new CarComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
