import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double Elma = 3.67 , Armut = 2.14  , Domates = 1.11 , Muz = 0.95 , Patlican = 5 , Toplam ,  elmaKilo , armutKilo , domatesKilo, muzKilo , patlicanKilo ;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo elma almak istiyorsunuz ? ");
        elmaKilo = input.nextDouble();
        System.out.println("Kaç kilo armut almak istiyorsunuz ? ");
        armutKilo = input.nextDouble();
        System.out.println("Kaç kilo domates almak istiyorsunuz ? ");
        domatesKilo = input.nextDouble();
        System.out.println("Kaç kilo muz almak istiyorsunuz ? ");
        muzKilo = input.nextDouble();
        System.out.println("Kaç kilo patlıcan almak istiyorsunuz ? ");
        patlicanKilo = input.nextDouble();
        Toplam = (Elma*elmaKilo) + (Armut*armutKilo) + (domatesKilo * Domates) + (muzKilo*Muz) + (patlicanKilo * Patlican);
        System.out.println(" Armut Kaç Kilo ? : " + armutKilo);
        System.out.println(" Elma Kaç Kilo ? : " + elmaKilo);
        System.out.println(" Muz Kaç Kilo ? : " + muzKilo);
        System.out.println(" Domates Kaç Kilo ? : " + domatesKilo);
        System.out.println(" Patlıcan Kaç Kilo ? : " + patlicanKilo);
        System.out.println(" Toplam Tutar : " + Toplam);



    }
}