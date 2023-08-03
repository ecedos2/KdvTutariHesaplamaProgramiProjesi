package Odev2;
import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {

        double kdv ,tutar, kdvTutari, kdvliTutar;


    Scanner input= new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar= input.nextDouble();



         boolean kdvOrani=(0< tutar)&& (tutar<1000);
         kdv= kdvOrani ? 0.18:0.08;
         kdvTutari= tutar*kdv;
         kdvliTutar=tutar+kdvTutari;


        System.out.println("KDV'siz Tutar :"+ tutar);
        System.out.println("KDV Tutarı :"+ kdvTutari);
        System.out.println("KDV'li Tutar :"+ kdvliTutar);





    }
}
