class Account{
    public String username;
    private String email;
    private String password;

    public Account(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setPassword(String newPass){
        password = newPass;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        email = newEmail;
    }

}

public class EncapsulationTest {
    public static void main(String[] args){
        Account user1 = new Account("montasir", "it22016@mbstu.ac.bd", "pass123");
        user1.setPassword("newPassword456");
        System.out.println(user1.getEmail());
    }
}
