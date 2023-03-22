package SimplePizza;

public class DeluxPizza extends  SimplePizza{
    DeluxPizza(Boolean isVeg)
    {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraTopping();
    }
}
