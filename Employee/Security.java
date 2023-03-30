package Employee;
public class Security extends employee{
    String Jabatan = "Security";
    int gaji = 6_000_000;
    
    @Override
    int hitung(int gaji,int jamKerja){
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}
