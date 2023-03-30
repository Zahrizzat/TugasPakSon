package Employee;
public class Manager extends employee{
    
    String Jabatan = "Manager";
    int gaji = 15_000_000;
    
    @Override
    int hitung(int gaji,int jamKerja){
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }

}
