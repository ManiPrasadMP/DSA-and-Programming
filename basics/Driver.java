package coreJava;

public class Driver {
	void drive() {
		Car c = new Car();
		c.start();
		c.changeGear(1);
		c.changeGear(3);
		c.changeGear(5);
		System.out.println("Driver driving the car fastly");
		c.stop();
	}

}
