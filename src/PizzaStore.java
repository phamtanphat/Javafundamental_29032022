public class PizzaStore {

    public static void orderPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
