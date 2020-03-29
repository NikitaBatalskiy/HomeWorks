package com.skillsup.HW5;

public class HW5Starter {
    public static void main(String[] args) {
        MyList<Integer> myListI = new MyList<>();
        myListI.add(55);
        myListI.add(42);
        myListI.add(8);
        myListI.add(67);
        myListI.add(15);
        myListI.add(2);
        myListI.add(29);
        System.out.println("Largest Integer: " + myListI.largest());
        System.out.println("Smallest Integer: " + myListI.smallest());
//        MyList<String> myListS = new MyList<>();
//        myListS.add("afsfasfasf");
//        myListS.add("afsfasf");
//        myListS.add("afasf");
//        myListS.add("afsfasasfasfasf");
//        myListS.add("afsfasfafaf");
//        myListS.add("a");
//        myListS.add("afsaff");
//        System.out.println("Largest String: " + myListS.largest());
//        System.out.println("Smallest String: " + myListS.smallest());
    }
}
