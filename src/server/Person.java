package server;

import java.util.List;

/**
 * Created by bathoryalex on 3/16/2016.
 */
public class Person
{
    String name;

    public Person(String name, String email, List<Skill> skillset)
    {
        this.name = name;
        this.email = email;
        this.skillset = skillset;
    }

    String email;
    List<Skill> skillset;


    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getEmail()
    {
        return email;
    }

    void setEmail(String email)
    {
        this.email = email;
    }

    List<Skill> getSkillset()
    {
        return skillset;
    }

    void setSkillset(List<Skill> skillset)
    {
        this.skillset = skillset;
    }

}
