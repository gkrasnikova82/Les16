package com.company;

//ДЗ 15 Фильтрация множества элементов
//Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
//
//public Set<String> removeEvenLength(Set<String> set);
//
//Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]


import java.util.*;

class Animals {

    Set<String> listSet = new HashSet<>();// список животных

    public Set<String> removeEvenLength(Set<String> set){  // метод возвращающий множество в котором удалены элементы четной длины
        Set<String> listSetremoveEvenLength = new HashSet<>();
        for(String state : set){
            if ((state.length()% 2)!=0) {
               listSetremoveEvenLength.add(state);
            }
        }
        return listSetremoveEvenLength;
    }
}

public class Main {

    public static void main(String[] args) {
        Animals Animals = new Animals();
        Animals.listSet.add("слон");
        Animals.listSet.add("кот");
        Animals.listSet.add("собака");
        Animals.listSet.add("ящерица");
        Animals.listSet.add("енот");
        Animals.listSet.add("$");

        for(String state : Animals.listSet){
            System.out.print(state+ " ");
        }
        System.out.println();
        System.out.println("Все элементы нечетной длины исходного множества: ");
        Set<String> AnimalsRemoveEvenLength = new HashSet<>();
        AnimalsRemoveEvenLength = Animals.removeEvenLength(Animals.listSet);
        for(String state : AnimalsRemoveEvenLength){
            System.out.print(state+ " ");
        }
    }
}
