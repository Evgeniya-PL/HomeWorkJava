package homework5;

public abstract class Animal {
    protected int length;
    protected String name;
    protected String color;
    protected int age;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    protected abstract void run();

    protected abstract void swim();

    protected abstract void jump();
}
