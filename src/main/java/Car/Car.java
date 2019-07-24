package Car;

public abstract class Car {
    private String make;
    private String model;
    private String type;
    private int price;
    private String colour;

    public Car(String make, String model, String type, int price, String colour){
        this.make = make;
        this.model = model;
        this.type = type;
        this.price = price;
        this.colour = colour;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColour(){
        return this.colour;
    }
}
