package manideep.spring;

public class BaseballCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 mins on batting practice";
    }
}
