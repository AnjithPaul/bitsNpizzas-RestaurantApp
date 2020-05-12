package com.hfad.bitsandpizzas;

public class Pizza {

    private String name;
    private int imageResourceId;
    private String details;

    public static final Pizza[] pizzas = {
            new Pizza("Deep Dish",R.drawable.deep_dish,"It makes perfect sense that Chicago would be the birthplace for the heartiest of all pizza styles, baked in a high-sided pan to facilitate the formation of a crust that will contain a truly staggering payload of cheese and toppings, with the sauce and any finishing touches like spices or parmesan scattered on top."),
            new Pizza("Diavolo", R.drawable.diavolo,"Diavola is a variety of Italian pizza that is traditionally topped with tomato sauce, mozzarella cheese, spicy salami, and hot chili peppers. Black olives are optional and can be added for extra flavor."),
            new Pizza("Funghi", R.drawable.funghi,"Funghi is a variety of Italian pizza that is traditionally topped with tomato sauce, mozzarella cheese, mushrooms, oil, and parsley."),
            new Pizza("Indian",R.drawable.indian,"Indian Pizza simply denotes a pizza crust that swaps standard toppings like pepperoni and barbecue chicken for flavor-packed Indian food favorites like saag paneer and tandoori chicken, as well as popular ingredients used in Indian cuisine like fenugreek and chutney"),
            new Pizza("St.Louis",R.drawable.louis,"Perhaps the most divisive pizza in the US -- sushi pizza be damned -- St. Louis’ take on pizza is a cracker-thin, overloaded, square-sliced round pie not dissimilar in appearance to a tavern pie, but with a thinner crust and approximately a metric ton more oregano.")
    };


    private Pizza(String name, int imageResourceId,String details) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.details=details;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public String getDetails(){
        return details;
    }
}
