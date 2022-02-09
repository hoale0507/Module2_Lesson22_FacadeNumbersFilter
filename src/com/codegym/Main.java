package com.codegym;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        RandomNumber randomNumber = new RandomNumber();
//        RandomList randomList = new RandomList();
//        ListFilter listFilter = new ListFilter();
//        ListPrinter listPrinter1 = new ListPrinter();
//
//        List<Integer> numbers = randomList.generateList(10, 0,100);
//        List<Integer> filteredOddNumbers = listFilter.filterOdd(numbers);
//        listPrinter1.printList(filteredOddNumbers);

        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.setListPrinter(20, 0, 100);

    }
}
