package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        /* creating a binary tree and entering the nodes */


        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        int n = in.nextInt();
        while(n != 0){
            tree.add(n);
            n = in.nextInt();
        }

        System.out.println(tree.size());



/*

        int[] y = { 10,9,8,7,4,1};
        System.out.println(Arrays.binarySearch(y,1));

        MyLinkedList<String> str = new MyLinkedList<>();

        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 != 0 ) return -1;
                if (o1 % 2 != 0 && o2 % 2 == 0 ) return  1;
                return 0;
            }
        });
        for(int i=1;i<=10;i++) {
            treeSet.add(i);
        }
        for(Integer i: treeSet) {
            System.out.println(i);
        }

        f(500,500,100);
*/
    }

    static void f(int x, int y, int r){
        System.out.println("Рисуем!");
        System.out.println(x +", " + y + ", " + r);
        if (r > 15) {
            f(x + r, y, r / 2);
            f(x - r, y, r / 2);
            f(x, y - r, r / 2);
            f(x, y + r, r / 2);

        }
    }
}

class IntCmp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0 ) return -1;
        if (o1 % 2 != 0 && o2 % 2 == 0 ) return  1;
        return 0;
    }
}

class MyLinkedList<E> {
    Node head;

    /**
     * <p>Insert new element in the list</p>
     * @param data new element of the list
     */
    public void insert(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    /**
     * <p>Print all elements of the list in standard output</p>
     */
    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
           //currNode.next++;
        }
    }

    class Node {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
