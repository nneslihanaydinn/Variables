package variables;

import java.util.Scanner;

public class Variables {


        public static void main(String[] args) {

            // SORU1: Herhangi bir uc ogenin fiyatlari icin double data tipinde degiskenler olusturunuz.fiyatlarin toplamini konsola yazdiriniz

            double gomlekFiyat = 12.99;
            double sapkaFiyat = 23.99;
            double ayakkabiFiyat = 15.99;
            System.out.println("Toplam Fiyat" + (gomlekFiyat + sapkaFiyat + ayakkabiFiyat));




        /*SORU 2:
        Herhangi bir 3 oge icin float,long,integer data tipinde degiskenler olusturunuz. Bu degiskenlerin degerlerinin
        carpimini konsolda yazdirizniz
         */

            float x = 15.99F;
            long y = 13L;
            int z = 12;
            System.out.println(" Degiskenlerin carpimi:" + x*y*z);



        /*  SORU 3: Basit faizi bulmak icin bir kod yaziniz.
      Not: Basit faiz formulu=anapara*oran*yilDegeri/100
        */

            int para= 10000,oran=6,yilDegeri =3;
            int basitFaiz= 10000*6*3/100;
            System.out.println("Basit faiz degeri:"+ basitFaiz);




        /* SORU 4: Bir string ve iki long data tipinde degisken oluturunuz. Konsolda bu long degiskenlerin tolami ve carpimi
        String ile yazdiriniz.
         */
//    String s="Sonuc";
//    Long a= 123L;
//    Long b= 236437544L;
//        System.out.println(s+ (a+b));
//        System.out.println(s+ a*b);

            String m = "Sonuc";
            int a= 1234;
            int b= 12;
            System.out.println(m+ (a+b));
            System.out.println(m+ a*b);




       /*SORU 5: Degerleri farkli olan iki boolean data tipinde degisken olusturunuz ve bu degerleri iki ardisik deger
       arasinda bosluk birakacak sekilde ayni satirda yazdiriniz.
        */

            boolean ab = true;
            boolean ac = false;
            System.out.println(ab+""+ac);




        /* SORU 6: 3 oge (kitap, defter ve laptop) fiyati icin long data tipinde degiskenler olusturunuz. Konsolda
        2 kitap, 4 defter ve 3 laptop icin toplam fiyati yazidiriniz.
         */

            long kitap= 12,defter=33,laptop=34;
            long toplamFiyat= 2*defter+4*kitap+3*laptop;
            System.out.println("Toplam fiyat:" + toplamFiyat);



            //   SORU 7: iki tamsayiyi degistirmek icin kod yaziniz.

            Scanner scan = new Scanner(System.in);
            System.out.println("2 sayi giriniz:");
            double n1= scan.nextDouble();
            double n2= scan.nextDouble();
            System.out.println("Degistirdikten sonra:" + n1+"-"+ n2);

            double temp=n1;
            n1=n2;
            n2=temp;
            System.out.println("Degistirdikten sonra:" + n1 + "-"+ n2);





        }
    }

