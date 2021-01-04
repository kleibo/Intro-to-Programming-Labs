package hardware;

public class CPU {
    String manufacturer;
    String frequency;
    int cores;
    int watts;
    double price;
    
    public CPU(String manufacturer, String frequency, int cores, int watts, double price){
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.cores = cores;
        this.watts = watts;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("-------------------");
        System.out.println("CPU Info");
        System.out.println("-------------------");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Frequency = " + frequency);
        System.out.println("Cores = " + cores);
    }
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getFrequency(){
        return frequency;
    }
    public void setFrequency(String frequency){
        this.frequency = frequency;
    }
    
    public int getCores(){
        return cores;
    }
    
    public void setWatts(int watts){
        this.watts = watts;
    }
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
        
}
