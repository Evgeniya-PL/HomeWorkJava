package homework5;

public class Cat extends Animal {

    public Cat(String name, String color, int age){
        super(name, color,age);
    }

    @Override
    protected void run() {
        System.out.println(name + " пробежал 200 м. ");
    }

    @Override
    protected void swim(){
        System.out.println(name + " не умеет плавать. ");
    }

    @Override
    protected void jump(){
        System.out.println(name + " прыгнул 2 м.");
    }

}
