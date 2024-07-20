package _8SingletonFactoryPattern;

public class FriendRequestNotification extends Notification
{
    public FriendRequestNotification(String content)
    {
        this.content = content;
    }

    @Override
    public void deliver()
    {
        NotificationManager.getInstance().deliverNotification(this);
    }
}
