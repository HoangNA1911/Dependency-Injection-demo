public class Client implements InjectionMessage {

    // ở đây emailService được định nghĩa ở trong client ==> liên kết ràng buộc
    //private EmailService emailService= new EmailService();
    private MessageService messageService;

    //Sử dụng constructor injection
//    public Client (MessageService messageServiceParam){
//        this.messageService = messageServiceParam;
//    }
    @Override
    public void setService(MessageService messageServiceParam){
        this.messageService= messageServiceParam;
    }

    public void processMessage(String message){
        messageService.sendMessage("Hoang dep trai");
    }

}
