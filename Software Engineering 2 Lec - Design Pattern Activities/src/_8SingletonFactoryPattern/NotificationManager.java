package _8SingletonFactoryPattern;

public class NotificationManager
{
    private static NotificationManager instance;

    private NotificationManager()
    {
        // Private constructor to prevent instantiation
    }

    public static NotificationManager getInstance()
    {
        if (instance == null)
        {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void deliverNotification(Notification notification)
    {
        // Logic to deliver the notification
        System.out.println("Delivering notification… " + notification.getContent());
    }
}
