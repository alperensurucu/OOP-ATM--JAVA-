
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bankamıza hoş geldiniz...");
        
        
        System.out.println("************************");
        System.out.println("kullanıcı girişi...");
        System.out.println("************************");  
        
        int giris_hakki = 3;
        
        while (true){
        
            if (login.login(hesap)) {
            
                System.out.println("giriş basarılı...");
                
                break;
            }
            else{
                System.out.println("giriş başarısız...");
                giris_hakki -= 1 ;
                System.out.println("kalan giriş hakkı: " + giris_hakki);
            
            }
            if(giris_hakki == 0){
                
                System.out.println("giriş hakkınız bitti...");
                
               return;
            }
            
            
        }
        System.out.println("************************");

        String islemler = "1.işlem: Bakiye Sorgulama\n"
                        +"2. işlem: Para Yatırma\n"   
                        +"3. işlem: Para Çekme\n"
                        +"Çıkış için q ya basın";
        System.out.println(islemler);
        System.out.println("************************");
        
        while (true){
            System.out.println("işlem seçiniz:");
            String islem = scanner.nextLine();
        if (islem.equals("q")){
            System.out.println("işlemden çıkılyor");
            break;
        }    
        
        else if (islem.equals("1")) {
                System.out.println("bakiyeniz: " + hesap.getBakiye());
    
        }
        else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutarı giriniz:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatır(tutar);
        }
        else if (islem.equals("3")) {
            System.out.println("çekmek istediğiniz tutarı giriniz: ");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            hesap.paraCek(tutar);
          
        }     
        else{
            System.out.println("geçersiz işlem ..."); 
        
        }
    } 
    
}
}