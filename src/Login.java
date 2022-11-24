
import java.util.Scanner;


public class Login {
    public boolean login (Hesap hesap){
        
        Scanner scanner = new Scanner(System.in);
        String kullanıcı_adı;
        String sifre ;
        
        System.out.println("kullanıcı adı : ");
        kullanıcı_adı = scanner.nextLine();
        System.out.println("parola : ");
        sifre = scanner.nextLine();
        
        if(hesap.getKullanıcı_adı().equals(kullanıcı_adı) && hesap.getSifre().equals(sifre)){
            return true;
         
        }
        else{
            return false;
        }
                
    
    
    } 
    
}
