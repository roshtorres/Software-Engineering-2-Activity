package _8SingletonFactoryPattern;

public abstract class Notification
{
    protected String content;

    public String getContent()
    {
        return content;
    }

    public abstract void deliver();
}
