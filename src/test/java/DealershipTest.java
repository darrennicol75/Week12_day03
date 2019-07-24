import Car.Car;
import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {


        Dealership dealership;
        Car car;

        @Before
        public void setUp(){ dealership = new Dealership("Arnold CodeClan");
        }

        @Test
        public void hasName() {
            assertEquals("Arnold CodeClan", dealership.getName());
        }

        @Test
        public void stockStartsEmpty(){
            assertEquals(0, dealership.stockCount());
        }

        @Test
        public void dealerCanTakeCar(){
            dealership.dealerCanTakeCar(car);
            dealership.dealerCanTakeCar(car);
            assertEquals(2, dealership.stockCount());
        }

//        @Test
//        public void hasMake() {
//            dealership.dealerCanTakeCar(car);
//        assertEquals("Tesla", dealership.getMake(car));
//        }

    }

