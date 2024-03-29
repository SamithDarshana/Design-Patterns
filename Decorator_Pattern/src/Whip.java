public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
}
