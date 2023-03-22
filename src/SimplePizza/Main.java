package SimplePizza;

public class Main {
    public static void main(String []args)
    {
        SimplePizza p= new SimplePizza(false);
        p.addExtraCheese();
        p.addExtraTopping();
        p.addTakeaway();
        System.out.println(p.getBill());

        DeluxPizza d= new DeluxPizza(true);
        System.out.println(d.getBill());
        d.addTakeaway();
        d.addExtraCheese();
        d.addTakeaway();
        System.out.println(d.getBill());
    }
}
