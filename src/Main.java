import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tanımlamalar & Kullanıcı Girişi
        System.out.print("Doğum ayınızı sayı olarak giriniz(1-12): ");
        int ay = input.nextInt();

        System.out.print("Doğum gününüzü sayı olarak giriniz(1-31): ");
        int gun = input.nextInt();

        //Ay&Gün'e göre Burç Atamaları
        switch (ay) {
            case 1:
                if (gun < 22) {
                    System.out.println("Burcunuz: Oğlak ");
                } else {
                    System.out.println("Burcunuz: Kova ");
                }
                break;
            case 2:
                if (gun < 20) {
                    System.out.println("Burcunuz: Kova ");
                } else {
                    System.out.println("Burcunuz: Balık ");
                }
                break;
            case 3:
                if (gun < 21) {
                    System.out.println("Burcunuz: Balık ");
                } else {
                    System.out.println("Burcunuz: Koç ");
                }
                break;
            case 4:
                if (gun < 21) {
                    System.out.println("Burcunuz: Koç ");
                } else {
                    System.out.println("Burcunuz: Boğa ");
                }
                break;
            case 5:
                if (gun < 22) {
                    System.out.println("Burcunuz: Boğa ");
                } else {
                    System.out.println("Burcunuz: İkizler ");
                }
                break;
            case 6:
                if (gun < 23) {
                    System.out.println("Burcunuz: İkizler ");
                } else {
                    System.out.println("Burcunuz: Yengeç ");
                }
                break;
            case 7:
                if (gun < 23) {
                    System.out.println("Burcunuz: Yengeç ");
                } else {
                    System.out.println("Burcunuz: Aslan ");
                }
                break;
            case 8:
                if (gun < 23) {
                    System.out.println("Burcunuz: Aslan ");
                } else {
                    System.out.println("Burcunuz: Başak ");
                }
                break;
            case 9:
                if (gun < 23) {
                    System.out.println("Burcunuz: Başak ");
                } else {
                    System.out.println("Burcunuz: Terazi ");
                }
                break;
            case 10:
                if (gun < 23) {
                    System.out.println("Burcunuz: Terazi ");
                } else {
                    System.out.println("Burcunuz: Akrep ");
                }
                break;
            case 11:
                if (gun < 22) {
                    System.out.println("Burcunuz: Akrep ");
                } else {
                    System.out.println("Burcunuz: Yay ");
                }
                break;
            case 12:
                if (gun < 22) {
                    System.out.println("Burcunuz: Yay ");
                } else {
                    System.out.println("Burcunuz: Oğlak ");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. ");
        }
    }
}