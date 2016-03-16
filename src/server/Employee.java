package server;


/**
 * Created by bathoryalex on 3/16/2016.
 */
public class Employee extends Person
{
    int salary;
    String jobTitle;

    int getSalary()
    {
        return salary;
    }

    void setSalary(int salary)
    {
        this.salary = salary;
    }

    String getJobTitle()
    {
        return jobTitle;
    }

    void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
