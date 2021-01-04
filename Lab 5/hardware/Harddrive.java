package hardware;

public class Harddrive {
    String manufacturer;
    String interfaceBus;
    int cache;
    double formFactor;
    double price;
    
    public Harddrive(String manufacturer, String interfaceBus, int cache, double formFactor, double price){
        this.manufacturer = manufacturer;
        this.interfaceBus = interfaceBus;
        this.cache = cache;
        this.formFactor = formFactor;
        this.price = price;
    }
    
    public void displayInfo(){
        System.out.println("-------------------");
        System.out.println("Harddrive Info");
        System.out.println("-------------------");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Interface Bus = " + interfaceBus);
        System.out.println("Cache = " + cache);
        System.out.println("Form Factor = " + formFactor);
        System.out.println("Price = " + price);
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getInterfaceBus(){
        return interfaceBus;
    }
    
    public void setInterfaceBus(String interfaceBus){
        this.interfaceBus = interfaceBus;
    }
    
    public int getCache(){
        return cache;
    }
    
    public void setCache(int cache){
        this.cache = cache;
    }
    
    public double getFormFactor(){
        return formFactor;
    }
    
    public void setFormFactor(double formFactor){
        this.formFactor = formFactor;
    }
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
