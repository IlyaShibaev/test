public class Cat {
    private String name;
    private int age;
    private String colour;
    private Double weight;
    private static int catCount;

    public Cat(String name, int age, String colour, Double weight){
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
        catCount++;
    }

    public Cat(){
        this("Kukusik", 3, "Brown", 5.0);
    }

    public void meow(){
        System.out.println("Meouw");
    }

    public int getAge(){
        return age;
    }
    public String getColour(){
        return colour;
    }
    public Double getWeight(){
        return weight;
    }
    public void pee() {
        weight-=20;
    }
    public void eat(){
        weight+=50;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age > this.age)
            this.age = age;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
}
