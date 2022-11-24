
public class Hesap {
    
    private String kullanıcı_adı;
    private String sifre;
    private int bakiye;

    public Hesap(String kullanıcı_adı, String sifre, int bakiye) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.sifre = sifre;
        this.bakiye = bakiye;
    } 

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatır (int tutar){
        bakiye += tutar;
        System.out.println("yeni bakiyeniz: " + bakiye);
       
     }
    public void paraCek(int tutar){
        if(bakiye - tutar < 0){
            System.out.println("yeterli bakiyeniz yok...");
        
        }
             
        else {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz : " + bakiye);
            
        
        }
    
    }
    
}
