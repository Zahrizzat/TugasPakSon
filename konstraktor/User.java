package konstraktor;
public class User {
    public String username;
    public String password;
    
    public User(String username, String password){
         this.username = username;
         this.password = password;
    }
    public void setUsername (String Username){
        this.username=username;
    }

    public void setpassword (String password){
          this.password= password;
    }
    public String getUsername(){
        return this.username;
    }
    public String getpassword(){
        return this.password;
    }
}

