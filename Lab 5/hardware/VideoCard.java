package hardware;
public class VideoCard{
    String manufacturer;
    String memory;
    int watts;
    double price;
    
    public VideoCard(String manufacturer, String memory, int watts, double price){
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.watts = watts;
        this.price = price;
    }
    
    public void displayInfo(){
        System.out.println("-------------------");
        System.out.println("Video Card Info");
        System.out.println("-------------------");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Memory = " + memory);
        System.out.println("Watts = " + watts);
        System.out.println("Price = " + price);
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getMemory(){
        return memory;
    }
    
    public void setMemory(String memory){
        this.memory = memory;
    }
    public int getWatts(){
        return watts;
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