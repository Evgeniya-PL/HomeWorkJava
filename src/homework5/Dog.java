package homework5;

import java.util.Random;

public class Dog extends Animal {

    public Dog(String name, String color, int age){
        super(name, color,age);
    }

    @Override
    protected void run() {

       int minRunDog = 1;
       int maxRunDog = 800;
       int i = maxRunDog - minRunDog;
        Random random = new Random();
        int runDog = random.nextInt(i + 100) + minRunDog;

        System.out.println(name + " пробежал " + runDog + " м.");
    }

    @Override
    protected void swim(){
        System.out.println(name + " проплыл 10 м. ");
    }

    @Override
    protected void jump(){
        System.out.println(name + " прыгнул 0,5 м.");
    }


}
