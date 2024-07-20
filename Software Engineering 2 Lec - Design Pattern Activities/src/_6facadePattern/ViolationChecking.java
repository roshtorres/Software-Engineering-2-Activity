package _6facadePattern;

public class ViolationChecking
{
    private boolean withViolaton;

    public ViolationChecking(boolean withViolaton)
    {
        this.withViolaton = withViolaton;
    }

    public boolean withViolaton()
    {
        return withViolaton;
    }
}
