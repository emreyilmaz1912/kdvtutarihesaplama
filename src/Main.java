import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("KDV Hesaplama Programına Hoşgeldiniz");

             /*Ödev
             Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
             tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız*/

        double urunFiyati;
        double kdvOrani8 = 0.08;
        double kdvOrani18 = 0.18;
        double kdvTutari;
        double kdvDahil;
        double kdvOraniSecimi;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz: ");

        urunFiyati = input.nextDouble();


        kdvOraniSecimi =  urunFiyati <= 1000 ? kdvOrani18 : kdvOrani8;
        kdvTutari = urunFiyati * kdvOraniSecimi;
        kdvDahil = urunFiyati + kdvTutari;


        System.out.println("Ürünün Fiyatı : " + urunFiyati);
        System.out.println("KDV Oranı : " + kdvOraniSecimi );
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("Ürünün KDV Dahil Fiyatı : " + kdvDahil);

    }
}