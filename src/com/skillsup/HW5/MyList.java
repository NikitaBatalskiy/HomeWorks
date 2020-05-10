package com.skillsup.HW5;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<T>>{
    private ArrayList<T> arrayList = new ArrayList<T>();

    public void add(T t) {
        arrayList.add(t);
    }

    public T largest() {
//        T max = arrayList.get(0);
//        for (T t : arrayList) {
//            if (t.compareTo(max) > 0){
//                max = t;
//            }
//        }
//        return max;
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size()-1);
    }

    public T smallest() {
//        T min = arrayList.get(0);
//        for (T t : arrayList) {
//            if (t.compareTo(min) < 0){
//                min = t;
//            }
//        }
//        return min;
        Collections.sort(arrayList);
        return arrayList.get(0);
    }
}
