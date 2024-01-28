
public class Urun implements Comparable<Urun>  {

    private String ad;
    private double fiyat;
    private double toplamPuan=0;
    private int sayac=0;
    
    public Urun(String ad, double fiyat){
        this.ad=ad;
        this.fiyat=fiyat;
    }

    public void Degerlendir(double puan){
        System.out.println("Ürüne verilen puan= "+ puan);
        toplamPuan+=puan;
        sayac++;
    }

    public double OrtalamaPuan(){
        System.out.println("Ürünün ortalama puanı= "+ toplamPuan/sayac);
        return toplamPuan/sayac;
    }


    @Override
    public int compareTo(Urun o){
       if (this.toplamPuan/sayac>o.toplamPuan/sayac){
        return 1;
       }
       else if (this.toplamPuan/sayac<o.toplamPuan/sayac){
        return -1;
       }
       else{
        return 0;
       }
    }

    @Override
    public boolean equals (Object o){
        if(this==o){
            return true;
        }
        if(!(o instanceof Urun)){
            return false;
        }
        Urun a= (Urun) o;
        return ad==a.ad && fiyat==a.fiyat;
    }

    @Override
    public String toString(){
        return ad;
    }
    
}
