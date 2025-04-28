class User{
    public String username;
    protected String email;
    private String password;

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setPassword(String newPass){
        password = newPass;
    }

}

public class AccessModifierTest {
    public static void main(String[] args){
        User user1 = new User("montasir", "it22016@mbstu.ac.bd", "pass123");
        user1.setPassword("newPassword456");
        System.out.println(user1.email);
    }
}
