package homework4;

public class HomeWork4 {
    public static void main(String[] args) {

        Worker[] personArr = new Worker[5];
        personArr[0] = new Worker("Ivanov", 30000, 43);
        personArr[1] = new Worker("Petrov", 35000, 47);
        personArr[2] = new Worker("Sidorov", 37000, 39);
        personArr[3] = new Worker("Ivanova", 25000, 22);
        personArr[4] = new Worker("Petrova", 45000, 57);

        for (int i=0; i < personArr.length; i++)
            if (personArr[i].getAge()> 40) personArr[i].printInfo();
        for (int i=0; i < personArr.length; i++)
            if (personArr[i].getAge()> 45) personArr[i].printBonusWade();
    }
}
