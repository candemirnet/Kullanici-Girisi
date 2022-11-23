import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String kullaniciAdi,sifre,sifreDegistirme,yeniSifre;
        Scanner imp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = imp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        sifre = imp.nextLine();

        //Sadece şifrenin yanlış olması durumu istendiği için ikinci bir if ile devam ettim.
        if(kullaniciAdi.equals("patika")){
            if(sifre.equals("java123")){
                System.out.println("Başarıyla Giriş Yapıldı");
            }else{
                System.out.print("Şifrenizi Yanlış Girdiniz.Sıfırlamak İstiyor Musunuz?(Evet/Hayır olarak cevaplandırın): ");
                sifreDegistirme = imp.nextLine();
                if(sifreDegistirme.equals("Evet")){
                    System.out.print("Yeni şifrenizi Giriniz: ");
                    yeniSifre =imp.nextLine();
                    if(yeniSifre.equals("java123")){ //Yeni şifrenin eski şifre ile karuşılaştırılması
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }else{
                        System.out.println("Şifre Başarıyla oluşturuldu");
                    }

                }else if (sifreDegistirme.equals("Hayır")){ //Cevabın Hayır olma durumu
                    System.out.println("Şifre Sıfırlama iptal edildi");
                }else{
                    System.out.println("Yanlış Bir Tuşlama Yaptınız"); // Cevabın Geçersiz olma durumu
                }
            }
        }else{
            System.out.println("Kullanıcı Adı Yanlış. Tekrar Dene");
        }
    }
}