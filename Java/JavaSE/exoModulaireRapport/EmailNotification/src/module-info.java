module EmailNotification {
    requires NotificationService;
    provides notification.NotificationService with eNotification.EmailNotification;
    exports eNotification;
}