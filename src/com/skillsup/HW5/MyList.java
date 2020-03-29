package com.skillsup.HW5;

import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> arrayList = new ArrayList<T>();

    public void add(T t) {
        arrayList.add(t);
    }

    public T largest() {
        T max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).doubleValue() > max.doubleValue()) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public T smallest() {
        T min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).doubleValue() < min.doubleValue()) {
                min = arrayList.get(i);
            }
        }
        return min;
    }
}
