package central;
import hardware.*;
public class Computer{
    CPU cpu = new CPU("AMD", "3.9GHz", 6, 65, 165.99);
    Harddrive harddrive = new Harddrive("Western Digital", "Sata 6Gb/s", 64, 3.5, 44.89);
    Memory memory = new Memory("G.Skill", "DDR4-3200", "16 GB", 169.99);
    VideoCard videoCard = new VideoCard("Asus", "11 GB", 250, 799.99);
    
    public Computer(CPU cpu, Harddrive harddrive, Memory memory, VideoCard videoCard){

    }
        public void displayInfo(){
            System.out.println("--------------");
            System.out.println("Computer Info");
            System.out.println("--------------");
            System.out.println(" ");
            
            cpu.displayInfo();
            harddrive.displayInfo();
            memory.displayInfo();
            videoCard.displayInfo();
            
            System.out.println("---------------");
            System.out.println("Computer total price = " + computerPrice());
        }
        
        public double computerPrice(){
            double price = cpu.getPrice() + harddrive.getPrice() + memory.getPrice() + videoCard.getPrice();
            return price;
        }
}