public class Main {
    public static void main(String[] args) {
        SMSService smsService = new SMSService();
        EmailService emailService =new EmailService();
        Client client = new Client();
        client.setService(smsService);
        client.processMessage("Hoang dep trai");
    }


}