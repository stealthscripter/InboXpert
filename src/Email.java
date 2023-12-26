public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alterteEmail;

    Email(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;

        System.out.println("Firstname: " + "\n" +  "Lastname: " + "\n");
    }
    public void display(){
        System.out.println("FirstName: " + firstname + "\n" + "LastName: " + lastname);
    }
}
