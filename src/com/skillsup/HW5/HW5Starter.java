package com.skillsup.HW5;

public class HW5Starter {
    public static void main(String[] args) {
        MyList<Integer> myListI = new MyList<>();
        myListI.add(55);
        myListI.add(99);
        myListI.add(2);
        myListI.add(42);
        System.out.println("Largest Integer: " + myListI.largest());
        System.out.println("Smallest Integer: " + myListI.smallest());
        MyList<String> myListS = new MyList<>();
        myListS.add("number123");
        myListS.add("number323");
        myListS.add("number500");
        myListS.add("number12");
        System.out.println("Largest String: " + myListS.largest());
        System.out.println("Smallest String: " + myListS.smallest());
    }
}
