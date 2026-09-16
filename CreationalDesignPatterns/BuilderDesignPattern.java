class Main{
    public static void main(String[] args){
        Car car = new Car.CarBuilder().engine("v8").wheels(4).color("black").transitionType("Manual").build();
        System.out.println(car);
    }
}

class Car{
    private String engine;
    private int wheels;
    private String color;
    private String transitionType;

    public Car(CarBuilder car){
        this.engine = car.engine;
        this.wheels = car.wheels;
        this.color = car.color;
        this.transitionType = car.transitionType;
    }

    @Override
    public String toString(){
        return this.engine +" " + this.wheels +" "+ this.color + " " + this.transitionType;
    }

    public static class CarBuilder{
        private String engine;
        private int wheels;
        private String color;
        private String transitionType;

        public CarBuilder engine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder wheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder color(String color){
            this.color = color;
            return this;
        }

        public CarBuilder transitionType(String transitionType){
            this.transitionType = transitionType;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}