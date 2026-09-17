class Main{
    public static void main(String[] args){
        AirConditioner ar = new AirConditioner();
        AirConditionAdapter ardp = new AirConditionAdapter(ar);

        ardp.turnOn();
        ardp.turnOff();
    }
}

class AirConditioner{
    public void startCooling(){
        System.out.println("Air Conditioner starts cooling...");
    }

    public void stopCooling(){
        System.out.println("Air Conditioner stops cooling....");
    }
}

class CoffeeBrewMachine{
    public void startBrewing(){
        System.out.println("Coffee machine starts brewing...");
    }

    public void stopBrewing(){
        System.out.println("Coffee machine stops brewing....");
    }
}

interface Adapter{
    public void turnOn();
    public void turnOff();
}
public class AirConditionAdapter implements Adapter{
    AirConditioner airConditioner;

    public AirConditionAdapter(AirConditioner ar){
        this.airConditioner = ar;
    }
    
    @Override
    public void turnOn(){
        airConditioner.startCooling();
    }

    @Override
    public void turnOff(){
        airConditioner.stopCooling();
    }
}class Main{
    public static void main(String[] args){
        AirConditioner ar = new AirConditioner();
        AirConditionAdapter ardp = new AirConditionAdapter(ar);

        ardp.turnOn();
        ardp.turnOff();
    }
}

class AirConditioner{
    public void startCooling(){
        System.out.println("Air Conditioner starts cooling...");
    }

    public void stopCooling(){
        System.out.println("Air Conditioner stops cooling....");
    }
}

class CoffeeBrewMachine{
    public void startBrewing(){
        System.out.println("Coffee machine starts brewing...");
    }

    public void stopBrewing(){
        System.out.println("Coffee machine stops brewing....");
    }
}

interface Adapter{
    public void turnOn();
    public void turnOff();
}
public class AirConditionAdapter implements Adapter{
    AirConditioner airConditioner;

    public AirConditionAdapter(AirConditioner ar){
        this.airConditioner = ar;
    }
    
    @Override
    public void turnOn(){
        airConditioner.startCooling();
    }

    @Override
    public void turnOff(){
        airConditioner.stopCooling();
    }
}