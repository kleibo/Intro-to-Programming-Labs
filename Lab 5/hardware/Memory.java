package hardware;

public class Memory {
    String manufacturer;
    String speed;
    String size;
    double price;
    
    public Memory(String manufacturer, String speed, String size, double price){
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.size = size;
        this.price = price;
    }
    
    public void displayInfo(){
        System.out.println("-------------------");
        System.out.println("Memory Info");
        System.out.println("-------------------");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Speed = " + speed);
        System.out.println("Size = " + size);
        System.out.println("Price = " + price);
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getSpeed(){
        return speed;
    }
    
    public void setSpeed(String speed){
        this.speed = speed;
    }
    public String getSize(){
        return size;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    
}
