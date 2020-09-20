package com.company;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        //создать объекты головы ноги руки
        this.leg = new Leg();
        this.hand = new Hand();
        this.head = new Head();

    }
    public Leg getLeg(){
        return leg;
    }
    public Head getHead(){
        return head;
    }

    public Hand getHand() {
        return hand;
    }
    public void showInformation(){
        System.out.println("Меня зовут: " + name + " Возраст: " + age);
    }
/*public static void main(String[] args) {
        com.company.Human barsik = new com.company.Human();
        barsik.age = 3;
        barsik.name = "Барсик";

        System.out.println("Мы создали человека по имени " + barsik.name + ", его возраст - " + barsik.age);
    }*/

}