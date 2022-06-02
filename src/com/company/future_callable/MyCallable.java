package com.company.future_callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<People> {

    @Override
    public People call() throws Exception {
        People people = null;
        DbPeople dbPeople = new DbPeople();
        dbPeople.add("fff",44,"rr");
        dbPeople.add("rer",5,"pp");
        dbPeople.add("eee",54,"opo");
        for (int i = 0; i < dbPeople.getPeople().size(); i++) {
            if (i == dbPeople.getPeople().size() - 3){
                people = dbPeople.getPeople().get(i);
            }
        }
        
        return people;
    }
}
