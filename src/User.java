public class User {
    private Address address;
    private String userName;
    private String email;
    private String imieojca;
    public User (Address address, String userName, String  email, String imieojca){
        this.address = address;
        this.userName = userName;
        this.email = email;
        this.imieojca = imieojca;
    }
    public String toString(){
        return address + " " + userName + " " + email + " "+ imieojca+" ";

    }
}
