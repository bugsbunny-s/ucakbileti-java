import java.util.Scanner;
public class ucak {
    public static void main(String[] args) throws Exception {
        int yas,mesafe,tip;
        double tutar,indirimliTutar,indirimYas,indirimGd;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        tip = inp.nextInt();

        tutar = mesafe * 0.10;
        if (yas <= 0 || !(tip == 1 || tip == 2) || mesafe <= 0){
            System.out.println("Hatalı veri Girdiniz .");
        }
        else if (yas <= 12 && tip == 2){
            indirimYas = tutar * 0.50;
            indirimliTutar = tutar - indirimYas;
            indirimGd = indirimliTutar * 0.20;
            tutar = indirimliTutar - indirimGd;
            System.out.println("Toplam Tutar " + tutar * 2);
        }
            else if (yas <= 12 && tip == 1){
                indirimYas = (tutar / 2);
                tutar = tutar - indirimYas;
                System.out.println("Toplam Tutar " + tutar);
            }
            else if ((yas > 12 && yas <= 24) && tip == 2){
                indirimYas = tutar * 0.10;
                indirimliTutar = tutar - indirimYas;
                indirimGd = indirimliTutar * 0.20;
                tutar = indirimliTutar - indirimGd;
                System.out.println("Toplam Tutar : " + tutar * 2);
            }
            else if ((yas > 12 && yas <= 24)&& tip == 1 ){
                indirimYas = tutar * 0.10;
                tutar = tutar - indirimYas;
                System.out.println("Toplam Tutar " + tutar);
            }
            else if (yas >= 65 && tip == 2){
                indirimYas = tutar * 0.30;
                indirimliTutar = tutar - indirimYas;
                indirimGd = indirimliTutar * 0.20;
                tutar = indirimliTutar - indirimGd;
                System.out.println("Toplam Tutar " + tutar *2);
            }
            else if (yas >=65 && tip == 1){
                indirimYas = tutar * 0.30;
                tutar = tutar - indirimYas;
                System.out.println("Toplam Tutar " + tutar);
            }
             
            else {
                if (tip == 2)
                System.out.println("Toplam Tutar : " + tutar * 2);

                else{
                    System.out.println("Toplam Tutar : " + tutar);
                }
            }
        }
    }