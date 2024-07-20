package singleton;

public class UserSession
{
    private static UserSession instance = null;
    private String userName;

    private UserSession() {}

    public static UserSession getInstance()
    {
        if (instance == null)
        {
            instance = new UserSession();
        }
        return instance;
    }

    public String getUserName()
    {
        return userName;
    }

    public boolean setUserName(String userName)
    {
        if (userName == null)
        {
            System.out.println("Invalid user name");
            return false;
        }

        if (this.userName == null)
        {
            this.userName = userName;
            return true;
        }
        else if (this.userName.equals(userName))
        {
            System.out.println("User already logged in");
            return false;
        }
        else
        {
            System.out.println("User already logged out");
            this.userName = userName;
            return true;
        }
    }
}
