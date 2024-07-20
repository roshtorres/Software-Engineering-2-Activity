package _6facadePattern;

public class FailingCoursesDetection
{
    private boolean talkToDean;

    public FailingCoursesDetection(boolean talkToDean)
    {
        this.talkToDean = talkToDean;
    }

    public boolean talkToDean()
    {
        return talkToDean;
    }
}
