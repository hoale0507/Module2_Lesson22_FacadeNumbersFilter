package com.codegym;

import java.util.List;

public class RandomListFacade {
    RandomList randomList;
    ListFilter listFilter;
    ListPrinter listPrinter;

    public RandomListFacade() {
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }

    public void setListPrinter(int size, int min, int max){
        List<Integer> numbers = randomList.generateList(size, min, max);
        List<Integer> oddNumbers = listFilter.filterOdd(numbers);
        listPrinter.printList(oddNumbers);
    }
}
