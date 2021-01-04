//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 5
// DUE: 2/26/19
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package central;

import central.Computer;
import hardware.CPU;
import hardware.Harddrive;
import hardware.Memory;
import hardware.VideoCard;

public class App {

    public static void main(String[] args){
        CPU cpu = new CPU("AMD", "3.9GHz", 6, 65, 165.99);
        Harddrive harddrive = new Harddrive("Western Digital", "Sata 6Gb/s", 64, 3.5, 44.89);
        Memory memory = new Memory("G.Skill", "DDR4-3200", "16 GB", 169.99);
        VideoCard videoCard = new VideoCard("Asus", "11 GB", 250, 799.99);
    
    Computer computer = new Computer(cpu, harddrive, memory, videoCard);
        computer.displayInfo();
        
    }
    
}
