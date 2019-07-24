package Components;

public abstract class Component {
    private String make;
    private String model;
    private String type;

    public Component(String make, String model, String type){
        this.make = make;
        this.model = model;
        this.type = type;
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

}
