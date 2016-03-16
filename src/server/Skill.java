package server;

/**
 * Created by bathoryalex on 3/16/2016.
 */
public class Skill
{
    String name;
    String description;
    double rate;

    public Skill(String name, String description, double rate)
    {
        this.name = name;
        this.description = description;
        this.rate = rate;
    }

    String getName()
    {
        return name;
    }

    String getDescription()
    {
        return description;
    }

    double getRate()
    {
        return rate;
    }
}
