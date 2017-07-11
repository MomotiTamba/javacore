package com.kitcenter.runners.homework.lesson16;


import com.kitcenter.app.homework.lesson16.*;

public class HomeTask16Runner {
    public static void main(String[] args) {
        Tractor wheeledTractor = new WheeledTractor("Wheeled Tractor", 99);
        Tractor crawlerTractor = new CrawlerTractor("Crawled Tractor", 101);
        wheeledTractor.setPassenger(3);
        wheeledTractor.setWeight(1500);
        wheeledTractor.setWheel(4);
        crawlerTractor.setPassenger(4);
        crawlerTractor.setWeight(2000);
        crawlerTractor.setWheel(0);
        System.out.println(wheeledTractor);
        System.out.println(crawlerTractor);
    }
}
