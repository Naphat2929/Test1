import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int min, past, hr, sum, sum1, sum2;
        Scanner input = new Scanner(System.in);
        hr = input.nextInt();
        min = input.nextInt();
        past = input.nextInt();
        sum = ((hr * 60) + (min + past)) / 60;
        sum1 = (min + past) % 60;
        sum2 = (23 - hr);

        if (sum > 0 && sum < 10) {
            System.out.print("0" + sum + ":" + (sum1));
        } else if (sum > 9 && sum < 24) {
            System.out.print(sum + ":" + sum1 + "0");
        } else if (sum == 24) {
            System.out.print("0" + sum2 + ":" + sum1);
        }
    }
}