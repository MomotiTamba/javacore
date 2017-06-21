package com.kitcenter.runners.classwork.lesson17;

import com.kitcenter.app.classwork.lesson17.Enum.Season;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SeasonRunner {
    public static void main(String[] args) {

        Season season = Season.SPRING;
        if (season == Season.SPRING) {
            season = Season.SUMMER;
        }

        System.out.println(season.name());
        System.out.println(season.AUTUMN.name());

        Season season1 = Season.valueOf("spring".toUpperCase());
        System.out.println(season1);
        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));

        System.out.print("Input one of the season: ");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            Season seasonChoice = Season.valueOf(bf.readLine().toUpperCase());
            switch (seasonChoice) {
                case SPRING:
                    System.out.println("Correct: " + Season.SPRING.name());
                    break;
                case SUMMER:
                    System.out.println("Correct: " + Season.SUMMER.name());
                    break;
                case AUTUMN:
                    System.out.println("Correct: " + Season.AUTUMN.name());
                    break;
                case WINTER:
                    System.out.println("Correct: " + Season.WINTER.name());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("something what you inputting is wrong");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
    }
}
