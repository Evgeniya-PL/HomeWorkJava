package homework5;

public class HomeWork5 {

public static void main(String[] args){

    Dog dogOne = new Dog("Tuzik", "White", 4);
    Dog dogTwo = new Dog("Bobik", "Grey", 7);
    Horse horseOne = new Horse ("Marusya", "Ginger", 9);
    Bird birdOne = new Bird ("Chirik", "Blue", 3);
    Cat catOne = new Cat ("Barsik", "Black", 5);

    Animal[] farm = {dogOne, dogTwo, horseOne, birdOne, catOne};
    for (int i=0; i < farm.length; i++) {
        farm[i].run();
        farm[i].jump();
        farm[i].swim();
    }


    }
}
