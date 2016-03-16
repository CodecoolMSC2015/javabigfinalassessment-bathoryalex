package server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * Created by bathoryalex on 3/16/2016.
 */
public class CSVDataReader
{
//    String csvFilePath;
//    List<Person> persons;

    static BufferedReader bufferedreader = null;
    static String line = "";

    public static void main(String[] args)
    {
        try
        {
            bufferedreader = new BufferedReader(new FileReader(
                    "D:\\CodeCool\\Workspace_Intelli_J\\javabigfinalassessment-bathoryalex\\Documentation\\person.csv"));
            while ((line = bufferedreader.readLine()) != null)
            {
                String[] data = line.split(",");
            }
        } catch (Exception e)
        {
        }
    }
}


