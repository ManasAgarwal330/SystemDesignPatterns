class Main{
    public static void main(String[] args){
        Coffee espresso = new Espresso();
        Coffee milkEspressoCoffee = new MilkDecorator(espresso);
        Coffee sugarMilkCoffee = new SugarDecorator(milkEspressoCoffee);

        System.out.println(espresso.getDescription() +" "+espresso.getPrice());
        System.out.println(milkEspressoCoffee.getDescription() +" "+milkEspressoCoffee.getPrice());
        System.out.println(sugarMilkCoffee.getDescription() +" "+sugarMilkCoffee.getPrice());
    }
}

interface Coffee{
    public int getPrice();
    public String getDescription();
}

public class Espresso implements Coffee{
    
    @Override
    public String getDescription(){
        return "Espresso Coffee";
    }

    @Override
    public int getPrice(){
        return 5;
    }
}

public class Capuchino implements Coffee{
    
    @Override
    public String getDescription(){
        return "Capuchino Coffee";
    }

    @Override
    public int getPrice(){
        return 10;
    }
}

public class MilkDecorator implements Coffee{
    Coffee coffee;
    
    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " , Milk";
    }

    @Override
    public int getPrice(){
        return coffee.getPrice() + 15;
    }
}

public class SugarDecorator implements Coffee{
    Coffee coffee;
    
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " , Sugar";
    }

    @Override
    public int getPrice(){
        return coffee.getPrice() + 20;
    }
}