package SimplePizza;

public class SimplePizza {
    private int price;
    int basePrice;
    int cheesePrice;
    private boolean isCheeseAdded;
    int extraTopping;
    private boolean isextraToppingAdded;
    int paperBagPrice;

    boolean isTakeaway;
    private Boolean isVeg;
    private String bill;
    private boolean isbillgenerated;

    ///////////////////////////////////////////////////

    public SimplePizza(Boolean isVeg)
    {
        this.isVeg=isVeg;
        this.cheesePrice=80;
        this.isCheeseAdded=false;
        this.isextraToppingAdded=false;
        this.isTakeaway=false;
        if(isVeg)
        {
            this.basePrice=300;
            this.extraTopping=70;

        }
        else
        {
            this.basePrice=400;
            this.extraTopping=120;

        }
        this.price=basePrice;
        this.paperBagPrice=20;
        isbillgenerated=false;
        //Code here
    }
    public int getPrice()
    {
        return this.price;
    }
    public void addExtraCheese()
    {
        if(isCheeseAdded==false)
        {
            this.price=this.price+ this.cheesePrice;
            isCheeseAdded=true;
        }

    }
    public void addExtraTopping()
    {
        if(isextraToppingAdded==false)
        {
            this.price=this.price+ this.extraTopping;
            isextraToppingAdded=true;
        }
    }
    public void addTakeaway()
    {
        if(isTakeaway==false)
        {
            this.price=this.price+this.paperBagPrice;
            isTakeaway=true;
        }

    }
    public String getBill()
    {
        if(isbillgenerated==false)
        {
            this.bill="Base Price of Pizza is: "+ this.basePrice+"\n" ;
            if(isCheeseAdded==true)
            {
                this.bill= this.bill+"Extra cheese add: "+this.cheesePrice+" \n";
            }
            if (isextraToppingAdded==true)
            {
                this.bill= this.bill+"Extra toppings add: "+this.extraTopping+" \n";
            }
            if (isTakeaway==true)
            {
                this.bill= this.bill+"Paper Bags : "+this.paperBagPrice+" \n";
            }
            this.bill= this.bill+"Total Price : "+this.price+" \n";



        }
        return this.bill;
    }
}

