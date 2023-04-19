

public class App {
    public static void main(String[] args) {
        JavaMail jm = new JavaMail();
        String to="avinashkariya05910@gmail.com";
        String from="avinashkariya05910@gmail.com";
        String subject="Testing";
        String text="this is testing mail..";
        boolean b =jm.sendEmail(to, from, subject, text);
        if(b){
            System.out.println("sent");
        }
        else{
            System.out.println("error");
        }
    }
}
