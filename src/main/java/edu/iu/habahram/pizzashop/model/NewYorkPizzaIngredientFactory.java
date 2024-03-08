package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraTomatoSauce();
    }

    public Cheese createCheese() {
        return new Reggiano();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Mushroom(),
                new Onion(),
                new RedPepper(),
                new Garlic()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}