package _8SingletonFactoryPattern;

public class MessageNotification extends Notification
{
    public MessageNotification(String content)
    {
        this.content = content;
    }

    @Override
    public void deliver()
    {
        NotificationManager.getInstance().deliverNotification(this);
    }
}
