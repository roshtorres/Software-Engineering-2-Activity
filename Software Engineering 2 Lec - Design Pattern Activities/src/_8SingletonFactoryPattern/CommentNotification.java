package _8SingletonFactoryPattern;

public class CommentNotification extends Notification
{
    public CommentNotification(String content)
    {
        this.content = content;
    }

    @Override
    public void deliver()
    {
        NotificationManager.getInstance().deliverNotification(this);
    }
}
