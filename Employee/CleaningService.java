package Employee;
public class CleaningService extends employee{
    
    String Jabatan = "Cleaning Service";
    int gaji = 5_000_000;
    
    @Override
    int hitung(int gaji,int jamKerja){
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}
