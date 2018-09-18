package com.adt;

import com.adt.datastructures.treedatastructure.BinaryTree;
import com.adt.datastructures.treedatastructure.NAryTreeNode;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //for binary tree testing
        BinaryTree binaryTree = new BinaryTree();
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
        } while (ch == 'Y'|| ch == 'y');

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
    }
}
