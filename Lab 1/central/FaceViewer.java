//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Project 1
// DUE: 1/16/19
//
// CERTIFICATION: I certify that I Kyle Leibovitz this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================


package central;

import javax.swing.JFrame;


public class FaceViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(150,250);
        frame.setTitle("An Alien Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
    
}
