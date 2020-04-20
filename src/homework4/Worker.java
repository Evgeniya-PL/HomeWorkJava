package homework4;

public class Worker {
    private String name;
    private int wage;
    private int age;

    public Worker(String name, int wage, int age) {
        this.name = name;
        this.wage = wage;
        this.age = age;
    }

    public Worker(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getWage() {
        return wage;
    }
    public int getAge(){
        return age;
    }

    void printInfo() {
            System.out.println(getName() + " " + getAge() + " " + getWage());
    }
    void printBonusWade(){
        if (getAge() > 45){
          int bonusWade = wage + 5000;
            System.out.println(getName() + " " + getAge() + " " + bonusWade);
        }
    }

}
