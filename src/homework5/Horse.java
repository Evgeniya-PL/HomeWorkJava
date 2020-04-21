package homework5;

public class Horse extends Animal {

    public Horse(String name, String color, int age){
        super(name, color,age);
    }

    @Override
    protected void run() {
        System.out.println(name + " пробежал 1500 м. ");
    }

    @Override
    protected void swim(){
        System.out.println(name + " проплыл 100 м. ");
    }

    @Override
    protected void jump(){
        System.out.println(name + " прыгнул 3 м.");
    }
}
