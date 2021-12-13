import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        int i = 1;
        int ebob = 0, ekok = 0;
        System.out.println("Bir sayı giriniz :");
        n1 = input.nextInt();

        System.out.println("Bir sayı daha giriniz :");
        n2 = input.nextInt();


        while (i <= n2 && i <= n1) {

            if (n1 % i == 0 && n2 % i == 0)
                ebob = i;

            i++;
        }
        System.out.println("Ebob :" + ebob);

        ekok = (n1 * n2) / ebob;
        System.out.println("Ekok :" + ekok);

    }
}
