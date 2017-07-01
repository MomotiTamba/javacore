package com.kitcenter.app.homework.lesson17;


import java.util.*;

public class GuessFamousPeople {

    private int capacity = 6;

    public ArrayList<FamousNamePeople> setUpGame() {
        ArrayList<FamousNamePeople> famousNamePeopleList = new ArrayList<>(capacity);
        famousNamePeopleList.add(FamousNamePeople.ALFRED_HITCHCOCK);
        famousNamePeopleList.add(FamousNamePeople.CLINT_EASTWOOD);
        famousNamePeopleList.add(FamousNamePeople.MARILYN_MONROE);
        famousNamePeopleList.add(FamousNamePeople.MICHAEL_JORDAN);
        famousNamePeopleList.add(FamousNamePeople.MORGAN_FREEMAN);
        famousNamePeopleList.add(FamousNamePeople.NIKOLA_TESLA);
        Collections.shuffle(famousNamePeopleList);
        return famousNamePeopleList;
    }
}

