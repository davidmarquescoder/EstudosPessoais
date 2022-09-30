import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Random generate = new Random();

        while(i<=9){
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }
        for(int j = 0; j <= 9; j++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}