public class Cat extends Animal{
    private String color;

    public Cat(String name, float weight) {
        super(name,weight);
    }

    //annotation : chú thích
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Color : Grey");
    }
}
