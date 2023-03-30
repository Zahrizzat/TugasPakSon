package Getter_Setter;
public class Main {

    public static void main(String[] args) {
        // Kode ini ditulis di dalam method main

// membuat objek dari class User
        User ijat = new User();

// menggunakan method setter
        ijat.setUsername("ijat");
        ijat.setPassword("kopiJava");

// menggunakan method getter
        System.out.println("Username: " + ijat.getUsername());
        System.out.println("Password: " + ijat.getPassword());
    }
}
