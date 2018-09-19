package com.adt;
import com.adt.datastructures.listdatastructure.LinkedListNode;
import com.adt.datastructures.listdatastructure.Queue;
import com.adt.datastructures.listdatastructure.Stack;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList linkedList;

        // Default constructor - let's put "0" into head element.
        linkedList = new LinkedList();

        // add more elements to LinkedList
        linkedList.add("9");
        linkedList.add("8");
        linkedList.add("7");
        linkedList.add("6");
        linkedList.add("5");

//        System.out.println("linkedList: \t\t" + linkedList);
//        System.out.println(".size(): \t\t\t\t" + linkedList.size());
//        System.out.println(".get(3): \t\t\t\t" + linkedList.get(3) + " (get element at index:3 - list starts from 0)");
//        System.out.println(".remove(2): \t\t\t\t" + linkedList.remove(2) + " (element removed)");
//        System.out.println(".get(3): \t\t\t\t" + linkedList.get(3) + " (get element at index:3 - list starts from 0)");
//        System.out.println(".size(): \t\t\t\t" + linkedList.size());
//        System.out.println("New LinkedList: \t" + linkedList);

        // for binary tree testing
       /* BinaryTree binaryTree = new BinaryTree();
        //Performing tree operations
        char ch;
        do
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. Insert ");
            System.out.println("2. Search");
            System.out.println("3. Count Nodes");
            System.out.println("4. Is it Empty?");

            int value = scan.nextInt();
            switch (value)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    try
                    {
                        binaryTree.insert(scan.nextInt());

                    }catch (Exception e)
                    {
                        System.out.println("Incorrect Entry ");

                    }
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    try
                    {
                    System.out.println("Search result : "+ binaryTree.search(scan.nextInt()));
                    }catch (Exception e)
                    {
                        System.out.println("Incorrect Entry ");

                    }
                    break;
                case 3 :
                    System.out.println("Nodes are = "+ binaryTree.count());
                    break;
                case 4 :
                    System.out.println("Empty or Not = "+ binaryTree.isEmpty());
                    break;
                default :
                    System.out.println("Incorrect Entry ");
                    break;
            }
             // Display tree
            System.out.print("\nPost Order : ");
            binaryTree.postOrder();
            System.out.print("\nPre Order : ");
            binaryTree.preOrder();
            System.out.print("\nIn Order : ");
            binaryTree.inOrder();

            System.out.println("\n\nDo you want to continue?(Type Y or N) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');*/

        //for NaryTree testing
       /* int n = 3;
        NAryTreeNode root = new NAryTreeNode("Values", n);
        root.addChild("Car");
        root.getChild(0).addChild("Parts");
        root.getChild(0).getChild(0).addChild("Engine");
        root.getChild(0).getChild(0).addChild("Steering");
        root.getChild(0).getChild(0).addChild("Wheels");
        root.getChild(0).addChild("Features");
        root.getChild(0).getChild(1).addChild("Rear Camera");
        root.getChild(0).getChild(1).addChild("Front Camera");
        root.addChild("Speed");
        root.getChild(1).addChild("Allowed");
        root.getChild(1).getChild(0).addChild("60");
        root.getChild(1).getChild(0).addChild("180");
        root.getChild(1).addChild("Not ALlowed");
        root.getChild(1).getChild(1).addChild(">180");
        root.getChild(1).getChild(1).addChild("<5");
        NAryTreeNode.print(root);*/

        //for Stack testing
        Stack stack = new Stack(new LinkedListNode(1, null), new LinkedListNode(2, null));
        stack.add(3);
        System.out.println(stack.peekStack());
        stack.popStack();
       // System.out.println(stack.peekStack());


        Queue queue = new Queue(1000);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.remove(10);

    }
}
