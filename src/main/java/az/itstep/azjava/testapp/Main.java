package az.itstep.azjava.testapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
Random r = new Random();
        ArrayList <Integer>list = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            list.add(r.nextInt(1000));
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}