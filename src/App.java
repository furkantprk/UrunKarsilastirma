import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Urun urun=new Urun("Elma",12);
        urun.Degerlendir(4.7);
        urun.Degerlendir(8);
        urun.Degerlendir(7);
        urun.OrtalamaPuan();

        System.out.println("******");

        Urun urun2=new Urun("Armut",15);
        urun2.Degerlendir(7);
        urun2.Degerlendir(5);
        urun2.Degerlendir(2);
        urun2.OrtalamaPuan();
        System.out.println("******");

        Urun urun3=new Urun("Kiraz",8);
        urun3.Degerlendir(1);
        urun3.Degerlendir(9);
        urun3.Degerlendir(5);
        urun3.OrtalamaPuan();
        System.out.println("******");

        Urun urun4= new Urun("Kiraz",8);
        System.out.println("*************");

        Urun[] urunler= {urun,urun2,urun3};
        Arrays.sort(urunler);
        for (Urun x : urunler) {
            System.out.println(x);
            
        }
    
        System.out.println("*********");
        System.out.println(urun.equals(urun2));
        System.out.println(urun3.equals(urun4));

         
    }

}