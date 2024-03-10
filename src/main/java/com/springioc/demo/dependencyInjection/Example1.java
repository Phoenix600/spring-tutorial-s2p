package com.springioc.demo.dependencyInjection;

import java.util.Scanner;

/**
 * MessageService interface
 */
interface  MessageService{
    void sendMessage(String message);
}


/**
 * EmailService Implementation class of MessageService Interface
 */
class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Mail "  + message);
    }
}


/**
 * SMSService Implements class of MessageService Interface
 */
class SMSService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS " + message);
    }
}


/**
 * Notification class using the dependency of type MessageService
 */
class NotificationService{
    private MessageService messageService;

    public NotificationService(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendNotification(String message){
        messageService.sendMessage(message);
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}

/**
 * Basic Example To Explain the spring dependency design pattern
 */
public class Example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();

        NotificationService notificationService = new NotificationService(smsService);


        System.out.println("Available Message Services : ");
        System.out.println("[1] sms-service");
        System.out.println("[2] email-service");
        System.out.println("[+]Enter the service name ");
        String result = input.next();

        while ( result!="EXIT"){
            switch (result){
                case "sms-service":
                    notificationService.setMessageService(smsService);
                    notificationService.sendNotification("Hello SMS");
                break;
                case "email-service":
                    notificationService.setMessageService(emailService);
                    notificationService.sendNotification("Hello Email Service");
                    break;
                default:
                    System.out.println("Invalid Service Selection");
                    break;
            }
            System.out.println("[+] Select another service : ");
            result = input.next();
        }
    }

}
