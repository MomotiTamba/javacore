package com.kitcenter.app.homework.lesson17;


import java.util.ArrayList;
import java.util.Scanner;

public class MenuListLesson17 {

    int countOfGuess = 0;
    Task17Message task17Message = new Task17Message();
    GuessFamousPeople guessFamousPeople = new GuessFamousPeople();

    private Scanner creationScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void menuListLesson17() {
        task17Message.welcomeMessageTask17();
        while (true) {
            task17Message.mainMenuMessageTask17();
            int choice = 0;
            try {
                choice = creationScanner().nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input, please type integers 1 or 0");
            }
            switch (choice) {
                case 1:
                    menuRandomAgeQuestioner();
                    break;
                case 2:
                    menuRandomLiveQuestioner();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void menuRandomAgeQuestioner() {
        ArrayList<FamousNamePeople> randomListName = guessFamousPeople.setUpGame();
        for (int index = 0; index < randomListName.size(); index++) {
            System.out.print("Name: " + randomListName.get(index).getFameName() + "\nAge: ");
            int guessAge = 0;
            try {
                guessAge = Integer.valueOf(creationScanner().nextInt());
            } catch (Exception e) {
                System.out.println("Wrong value, please input only integers");
            }
            if (guessAge == randomListName.get(index).getAge()) {
                System.out.println("Great, you're right!");
                countOfGuess++;
            } else {
                System.out.println("Ouch, you a little wrong!");
            }
        }
        menuGuessesAnswer(countOfGuess);
    }

    private void menuRandomLiveQuestioner() {
        ArrayList<FamousNamePeople> randomListName = guessFamousPeople.setUpGame();
        for (int index = 0; index < randomListName.size(); index++) {
            System.out.print("Name: " + randomListName.get(index).getFameName() + "\nIs a live?(yes/no): ");
            String guessLive = creationScanner().nextLine();
            if (guessLive.equalsIgnoreCase(randomListName.get(index).isLive())) {
                System.out.println("Great, you're right!");
                countOfGuess++;
            } else {
                System.out.println("Ouch, you a little wrong!");
            }
        }
        menuGuessesAnswer(countOfGuess);
    }

    private int menuGuessesAnswer(int countOfGuess) {
        switch (countOfGuess) {
            case 0:
                System.out.println("Your guesses result is: " + countOfGuess + " - it is so pure result, let's be better!");
                break;
            case 1:
                System.out.println("Your guesses result is: " + countOfGuess + " - it's better then 0, but you can better");
                break;
            case 2:
                System.out.println("Your guesses result is: " + countOfGuess + " - it's better then 0 or 1, but you can better");
                break;
            case 3:
                System.out.println("Your guesses result is: " + countOfGuess + " - not bad, but you can better");
                break;
            case 4:
                System.out.println("Your guesses result is: " + countOfGuess + " - cool result, you guessed almost all of them");
                break;
            case 5:
                System.out.println("Your guesses result is: " + countOfGuess + " - it's awesome result");
                break;
        }
        return countOfGuess;
    }
}
