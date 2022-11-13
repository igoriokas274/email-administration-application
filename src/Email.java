import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int mailboxCapacity = 500;
    private final String companyName = "homebox.dev";
    private int passwordLength = 12;
    private String alterPassword;

    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + selectDepartment() + companyName;
        System.out.println(generatePassword(passwordLength));
    }

    private String selectDepartment() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select department (1 - sales; 2 - development; 3 - accounting; Any other - none): ");
        int deptNumber = scanner.nextInt();
        switch (deptNumber) {
            case 1:
                return "sales.";
            case 2:
                return "development.";
            case 3:
                return "accounting.";
            default:
                return "";
        }
    }

    private String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int random = (int) (Math.random() * characters.length());
            password[i] = characters.charAt(random);
        }
        return new String(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getAlterPassword() {
        return alterPassword;
    }

    public void setAlterPassword(String alterPassword) {
        this.alterPassword = alterPassword;
    }

    public String showInfo() {
        return "[ Full name: " + firstName + " " + lastName + "; Email address: " + email + "; Mailbox capacity: " + mailboxCapacity + " MB ]";
    }
}
