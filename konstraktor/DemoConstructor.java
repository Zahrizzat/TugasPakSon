package konstraktor;
public class DemoConstructor{
    public static void main(String[] args) {
        User petani = new User ("ijat","baik daan santun");
        
        petani.setpassword("baik dan santun");
        petani.setUsername(",");
        
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
    
}
