package eNotification;

import notification.NotificationService;


public class EmailNotification implements NotificationService {

public String sendNotification(String notification){
    return " Notification envoyée : " + notification + ".";
}

}
