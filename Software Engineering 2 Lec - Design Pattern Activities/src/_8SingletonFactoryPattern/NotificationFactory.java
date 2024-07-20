package _8SingletonFactoryPattern;

public class NotificationFactory
{
    public static Notification createNotification(String type, String content)
    {
        switch (type)
        {
            case "FriendRequest":
                return new FriendRequestNotification(content);
            case "PostLike":
                return new PostLikeNotification(content);
            case "Comment":
                return new CommentNotification(content);
            case "Message":
                return new MessageNotification(content);
            default:
                throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
