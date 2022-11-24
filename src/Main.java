
public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("alperen surucu", "12345", 2000);
    
        atm.calis(hesap); //ATM class ında yazdığı metodu çalıştırıcak .
        
        System.out.println("programdan cıkılıyor...");
        
    
    
    }

}
