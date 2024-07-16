// create 2 arraylist and merge them into a single arraylist

import java.util.ArrayList;

public class ArraylistMerge{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        
        list1.add("Hello");
        list1.add("World");
        
        list2.add("Bye");
        list2.add("World1");
        list2.add("World2");

        int size1= list1.size();
        int size2= list2.size();
        
        // Method 1
        // list3.addAll(list1);
        // list3.addAll(list2);
        
        // Method 2
        // for (String str : list1) {
        //     list3.add(str);
        // }
        // for (String str : list2) {
        //     list3.add(str);
        // }
            
        // Method 3
        // for (int i = 0; i < size1; i++) {
        //     list3.add(list1.get(i));
        // }
        // for (int i = 0; i< size2; i++) {
        //     list3.add(list2.get(i));
        // }
            
        // Method 4
        // ArrayList<String> list3 = new ArrayList<String>(list1);
        // for (String str1 : list2) {
        //     list3.add(str1);
        // }

        // Method 5 
        // if (size1 > size2){
        //     for (int i = 0; i < list2.size(); i++) {
        //         list3.add(list2.get(i));
        //         list3.add(list1.get(i));
        //     }
        //     for (int i = size2; i < size1; i++) {
        //         list3.add(list1.get(i));
        //     }
        // }
        // else{
        //     for (int i = 0; i < size1 i++) {
        //         list3.add(list2.get(i));
        //         list3.add(list1.get(i));
        //     }
        //     for (int i = size1; i < size2; i++) {
        //         list3.add(list2.get(i));
        //     }
        // }
        
        // Method 6
        if (size1 >= size2){
            for (int i = 0; i < list2.size()/2; i++) {
                list3.add(list2.get(i));
                list3.add(list2.get(size2-i-1));
                list3.add(list1.get(i));
                list3.add(list1.get(size2-i-1));
            }
            for (int i = size2; i < size1; i++) {
                list3.add(list1.get(i));
            }
        }
        else{
            for (int i = 0; i < size1/2; i++) {
                list3.add(list2.get(i));
                list3.add(list2.get(size1-i-1));
                list3.add(list1.get(i));
                list3.add(list1.get(size1-i-1));
            }
            for (int i = size1; i < size2; i++) {
                list3.add(list2.get(i));
            }
        }
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
    }
}