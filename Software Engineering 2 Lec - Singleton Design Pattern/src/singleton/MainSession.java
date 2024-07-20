package singleton;

public class MainSession
{
    public static void main(String[] args)
    {
/* This program will disallow other users to use the session -- only one
user at a time. If a user already logs out, other user can use the session already.
*/

        UserSession session1 = UserSession.getInstance();
        session1.setUserName("Juan");
        System.out.println("Currently logged in: " + session1.getUserName());
        UserSession session2 = UserSession.getInstance();
        session2.setUserName("Peter");
        System.out.println("Currently logged in: " + session2.getUserName());
        UserSession session3 = UserSession.getInstance();
        session2.setUserName("Peter");
        System.out.println("Currently logged in: " + session3.getUserName());
    }
}
