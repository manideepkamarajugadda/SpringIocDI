package manideep.spring;

public class MyApp
{
    public static void main(String[] args)
    {
        Coach theCoach;
        theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}
