public class Main{
    public static void main(String[] args){
        Vehicle vehicle1 = VehicleFactory.getVehicle("car");
        Vehicle vehicle2 = VehicleFactory.getVehicle("bus");

        vehicle1.startEngine();
        vehicle2.startEngine();
    }
}

class VehicleFactory{
    public static Vehicle getVehicle(String vehicleType){
        switch(vehicleType){
            case "car":
                Vehicle car = new Car();
                return car;

            case "bus":
                Vehicle bus = new Bus();
                return bus;

            default:
                return null;
        }
                    
    }
}

interface IVehicle{
    public void startEngine();
    public void stopEngine();
}

class Vehicle implements IVehicle{
    @Override
    public void startEngine(){
        System.out.println("Vehicle Engine is Starting..");
    }

    @Override
    public void stopEngine(){
        System.out.println("Vehicle Engine is stopping");
    }
}

class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Car Engine is Starting..");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car Engine is stopping");
    }
}

class Bus extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Bus Engine is Starting..");
    }

    @Override
    public void stopEngine(){
        System.out.println("Bus Engine is stopping");
    }
}


