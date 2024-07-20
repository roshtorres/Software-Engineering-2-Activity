package _4commandPattern;

public class RemoteControl
{
    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
        clickButton();
    }

    public RemoteControl() {}

    public RemoteControl(Command command)
    {
        this.command = command;
        clickButton();
    }

    private void clickButton()
    {
        command.execute();
    }

}
