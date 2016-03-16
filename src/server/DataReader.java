package server;

import java.util.List;
import java.util.Set;

/**
 * Created by bathoryalex on 3/16/2016.
 */

public abstract class DataReader {
    String searchCriteria;
    SearchType SearchType;
    List<Person> persons;

    public abstract Set<Person> getPersons();

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public void setSearchType(SearchType searchType) {
        SearchType = searchType;
    }

}