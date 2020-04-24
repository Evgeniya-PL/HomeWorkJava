package homework6;

import java.io.*;

public class homework6 {
    static String fileOne = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    static String fileTwo = "ZYXWVUTSRQPONMLKJIHGFEDCBA9876543210";

    public static void main(String[] args) {

        try {
        FileOutputStream fosOne = new FileOutputStream("fileOne.txt", false);
        FileOutputStream fosTwo = new FileOutputStream("fileTwo.txt", false);
        FileOutputStream fosThree = new FileOutputStream("fileThree.txt", false);

            PrintStream psOne = new PrintStream(fosOne);
            psOne.println(fileOne);

            PrintStream psTwo = new PrintStream(fosTwo);
            psTwo.println(fileTwo);

            PrintStream psThree = new PrintStream(fosThree);
            psThree.println(fileOne + fileTwo);

       FileInputStream fisOne = new FileInputStream("fileOne.txt");
       FileInputStream fisTwo = new FileInputStream("fileTwo.txt");
       FileInputStream fisThree = new FileInputStream ("fileThree.txt");

       fisOne.close();
       fisTwo.close();
       fisThree.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException exception) {
        System.out.println(exception.getMessage());
    }

}

}