import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int number1 , number2 , select;
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        number1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz ? : ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuç: " + (number1+number2)); break;
            case 2:
                System.out.print("Sonuç : " + (number1-number2)); break ;
            case 3:
                System.out.print("Sonuç : " + (number1*number2)); break ;
            case 4:
                System.out.print("Sonuç :" + (number1/number2)); break ;
            default:
                System.out.print("Geçerli bir seçim yapınız.");
        }

        }



        }



