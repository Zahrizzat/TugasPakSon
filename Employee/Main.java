package Employee;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = scan.nextLine();
        System.out.println("Masukkan NIP: ");
        int nip = scan.nextInt();
        System.out.println("Masukkan Jabatan anda: ");
        String Jabatan = scan.nextLine();
        Jabatan = scan.nextLine();
        System.out.println("Masukkan Status anda: ");
        String Status = scan.nextLine();
        
        boss Boss = new boss();
        Manager Manager = new Manager();
        CleaningService CleaningService = new CleaningService();
        Security Security = new Security();
        int bA = 0;
        if (Jabatan.equalsIgnoreCase(Boss.Jabatan)){
            System.out.println("Berapa lama waktu kerja anda: ");
            int lamaKerja = scan.nextInt();
            bA = Boss.hitung(Boss.gaji, lamaKerja);
            System.out.println("Gaji Maksimal anda: "+Boss.gaji);
            
        }else if (Jabatan.equalsIgnoreCase(Manager.Jabatan)){
            System.out.println("Berapa lama waktu kerja anda: ");
            int lamaKerja = scan.nextInt();
            bA = Manager.hitung(Manager.gaji, lamaKerja);
            System.out.println("Gaji Maksimal anda: ");
            
        }else if (Jabatan.equalsIgnoreCase(CleaningService.Jabatan)){
            System.out.println("Berapa lama waktu kerja anda: ");
            int lamaKerja = scan.nextInt();
            bA = CleaningService.hitung(CleaningService.gaji, lamaKerja);
            System.out.println("Gaji Maksimal anda: ");
            
        }else if (Jabatan.equalsIgnoreCase(Security.Jabatan)){
            System.out.println("Berapa lama waktu kerja anda: ");
            int lamaKerja = scan.nextInt();
            bA = Security.hitung(Security.gaji, lamaKerja);
            System.out.println("Gaji Maksimal anda: ");
            
        }
        System.out.println("Masukkan Nama: "+nama);
        System.out.println("NIP: "+nip);
        System.out.println("Jabatan: "+Jabatan);
        System.out.println("status: "+Status);
        System.out.println("Gaji akhir: "+bA);
    }
}
