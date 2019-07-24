import Car.Car;
import People.Customer;

import java.util.ArrayList;

public class Dealership {


    private String name;
    private ArrayList<Car> stock;
    private ArrayList<Customer> customers;



    public Dealership(String name) {
        this.name = name;
        this.stock = new ArrayList<Car>();
        this.customers = new ArrayList<Customer>();

    }

    public String getName(){
        return name;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void dealerCanTakeCar(Car car){
        this.stock.add(car);
    }

}
