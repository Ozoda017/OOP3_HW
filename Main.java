
import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.List;
 
 public class Main {


    public static void main(String[] args) {

        Stream stream = new Stream();

        Stream group1 = new Stream();

        Stream group2 = new Stream();

        Stream group3 = new Stream();


        stream.addGroup(group1);

        stream.addGroup(group2);

        stream.addGroup(group3);

 
        for (Stream group : stream) {

            System.out.println(group);

        }

        Collections.sort(stream.getGroups());

        for (Stream group : stream) {

            System.out.println(group);

        }

    }

} 