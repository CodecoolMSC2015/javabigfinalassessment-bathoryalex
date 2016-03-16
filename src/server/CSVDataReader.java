package server;

import java.util.List;

/**
 * Created by bathoryalex on 3/16/2016.
 */
public class CSVDataReader extends DataReader
{
    String csvFilePath;
    List<Person> persons;

    CSVDataReader(String){}

    public List<Person> getPersons()
    {
        return persons;
    }
}
