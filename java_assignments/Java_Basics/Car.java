package Java_Basics;
public class Car {
	
	// class variables
	String model, registrationNo, colour;
	int speed;

	// constructor
	Car(String model, String registrationNo, String colour) {
		this.model = model;
		this.registrationNo = registrationNo;
		this.colour = colour;
        this.speed = 0;
	}

	// methods
	int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

	int decreaseSpeed(int decrement) {
        this.speed = this.speed - decrement;
        return this.speed;
    }

    public static void main(String[] args) {
        
        // new car objects created
        Car i10 = new Car("Grand i10", "MH01AB1234", "White");
        Car swift = new Car("Swift", "MH10BC5678", "Grey");

        // increasing speed
        System.out.println("Speed of " + i10.model + " = " + i10.increaseSpeed(20));
        System.out.println("Speed of " + swift.model + " = " + swift.increaseSpeed(35));
        System.out.println("Speed of " + swift.model + " = " + swift.decreaseSpeed(10));

    }
}


