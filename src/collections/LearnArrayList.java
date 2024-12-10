
package collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList<String> studentsName= new ArrayList<>();
//        studentsName.add("Shikha");
//        studentsName.add("Lovepreet");
//        studentsName.add("Ravneet");
//        studentsName.add("Prabhleen");
//        studentsName.add("Jugraj");
//        System.out.println(studentsName);
//        List<Integer> list= new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        //list.add(40);    // it will add element at the end of list
//        //System.out.println(list);
//        list.add(1, 50); // it will add element at any position of list
//        System.out.println(list);
//        List<Integer> newList= new ArrayList<>();
//        newList.add(80);
//        newList.add(90);
//        list.addAll(newList);
//        System.out.println(list);
//        System.out.println(list.get(4));
//        System.out.println(list.remove(3)); // remove the element from that index
//        System.out.println(list);
        Stack<String> animals= new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Pig");
        System.out.println("Stack :" +animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals.peek());
    }
}
