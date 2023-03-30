package notifikasi;
public class Main {
    public static void main(String[] args) {
        String emailPenerima = "zahrizzat.rahimi@gmail.com";
        String nomerHp = "081231241450";
        String mobileId = "android-123456";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "tutorial";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
