import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int gun;
        int ay;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Doğum gününüzün gününü girin: ");
         gun = scanner.nextInt();


        System.out.print("Doğum ayınızı girin (1-12 arasında bir sayı): ");
         ay = scanner.nextInt();






        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("Burçunuz Koç.");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {

            System.out.println("Burçunuz Boğa.");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 21)) {
            System.out.println("Burçunuz İkizler.");
        } else if ((ay == 6 && gun >= 22) || (ay == 7 && gun <= 22)) {
            System.out.println("Burçunuz Yengeç.");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("Burçunuz Aslan.");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("Burçunuz Başak.");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("Burçunuz Terazi.");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("Burçunuz Akrep.");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("Burçunuz Yay.");
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 20)) {
            System.out.println("Burçunuz Oğlak.");
        } else if ((ay == 1 && gun >= 21) || (ay == 2 && gun <= 19)) {
            System.out.println("Burçunuz Kova.");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println("Burçunuz Balık.");
        }


    }

}
