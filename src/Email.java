import java.util.Random;
import java.util.Scanner;

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

        this.department = setDepartment();
        System.out.println("Firstname: "+ firstname + "\n" +  "Lastname: "+lastname + "\n" +  "Department: "+department + "\n");

    }
    private String setDepartment(){
        System.out.println("Enter the department\n 1 For Sale \n 2 For Development \n 3 For Accounting \n 0 For none ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {
            return  "Sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3) {
            return "Acct";
        }
        else {
            return  " ";
        }
    }
    private String setPassword(){

        String randpass = Random()
        return
    }
}
