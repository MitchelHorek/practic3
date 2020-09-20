package com.company;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Ivan", 20);
        human.showInformation();

        human.getHead().setThought("Я лапушка");
        human.getHead().showThought();

        human.getLeg().setSize(45);
        human.getLeg().showSize();
        human.getLeg().bitleg();
        human.getHand().wave();

        Human human2 = new Human("Kate", 21);//для понимания что в один Human нельзя двух человек
        human2.showInformation();
        human2.getHand().wave();
    }
}
