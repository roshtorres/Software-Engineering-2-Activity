package _8SingletonFactoryPattern;

public class PostLikeNotification extends Notification
{
    public PostLikeNotification(String content)
    {
        this.content = content;
    }

    @Override
    public void deliver()
    {
        NotificationManager.getInstance().deliverNotification(this);
    }
}
