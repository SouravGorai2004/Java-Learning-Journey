class Engine {
    int horsepower;
    Engine(int horsepower) {
        this.horsepower = horsepower;
    }
}

class Car implements Cloneable {
    String model;
    Engine engine;

    Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car ccar = (Car)super.clone();
	ccar.engine=new Engine(ccar.engine.horsepower);
	return ccar; 
    }
}

class TestCar {
    public static void main(String[] args) throws Exception {
        Car c1 = new Car("Tesla", new Engine(500));
        Car c2 = (Car) c1.clone();

        c2.model = "BMW";
        c2.engine.horsepower = 1000;

        System.out.println(c1.model + " | " + c1.engine.horsepower);
        System.out.println(c2.model + " | " + c2.engine.horsepower);
    }
}
