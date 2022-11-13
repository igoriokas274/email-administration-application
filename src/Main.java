public class Main {
    public static void main(String[] args) {

        Email email1 = new Email("Tim", "Short");
        email1.setMailboxCapacity(1024);
        System.out.println(email1.showInfo());
    }
}