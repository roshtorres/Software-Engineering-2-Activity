package _8SingletonFactoryPattern;

public class Main
{
    public static void main(String[] args)
    {
        // Create Friend Request notification
        Notification friendRequest = NotificationFactory.createNotification("FriendRequest", "Thomas sent you a friend request.");
        friendRequest.deliver();

        // Create Post Like notification
        Notification postLike = NotificationFactory.createNotification("PostLike", "Your post got a like from Olivia.");
        postLike.deliver();

        // Create Comment notification
        Notification comment = NotificationFactory.createNotification("Comment", "Isabella commented on your post.");
        comment.deliver();

        // Create Message notification
        Notification message = NotificationFactory.createNotification("Message", "You received a message from Sophia.");
        message.deliver();
    }
}
