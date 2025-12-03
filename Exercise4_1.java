
import java.util.Scanner;
public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day+","+ month + ""+ date + ","+ year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day+","+ date +""+ month +","+ year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Gunu giriniz(Monday): ");
        String day = in.nextLine();
        System.out.print("Ayi giriniz(November): ");
        String month = in.nextLine();
        System.out.print("Tarihi giriniz(23): ");
        int date = in.nextInt();
        System.out.print("Yili giriniz(1978): ");
        int year = in.nextInt();
        System.out.println("\nAmerican format:");
        printAmerican(day, date, month, year);
        System.out.println("\nEuropean format:");
        printEuropean(day, date, month, year);
    }
}
