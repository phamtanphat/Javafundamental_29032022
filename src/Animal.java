public class Animal {
    // 1 Thuộc tính (properties)
    private String name;
    private float weight;

    // phương thức khởi (constructor)

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    // 2 Hành vi (function)

    public void showInfo(){
        System.out.println("Name : " + name);
        System.out.println("Weight : " + weight);
    }

    // getter va setter (Tính đóng gói)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
