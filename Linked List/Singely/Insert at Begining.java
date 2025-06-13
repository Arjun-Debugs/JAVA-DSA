/*
Question 2/ 9
A singly linked list is a linear data structure where each element (called a node) contains a data field and a reference (or link) to the next node in the sequence.
This task is to insert a new node at the beginning (head) of the list.

Input Format:
1.The first line contains an integer n — the number of elements currently in the linked list.
2.The second line contains n space-separated integers — the elements of the linked list.
3.The third line contains an integer x — the value to be inserted at the beginning of the list.

Output Format:
1.Output the linked list after inserting the new node at the beginning.
2.Print all elements in a single line, separated by spaces.

Constraints:
NA

Example:
Sample Input:
4
10 20 30 40
5

Sample Output:
5 10 20 30 40
*/
//Solution

import java.util.*;
public class Main
{
    class Node
    {
        int data;
        Node next;
    }
    public Node head = null;
    public void append(int data)
    {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if(head==null)
            head = newnode;
        else
        {
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = newnode;
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertAtBeginning(int val)
    {
        Node newNode = new Node();
        newNode.data=val;
        newNode.next=head;
        head = newNode;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val;
        Main obj = new Main();
        for(int i=0;i<n;i++)
        {
            val = sc.nextInt();
            obj.append(val);
        }
        int new_val = sc.nextInt();
        obj.insertAtBeginning(new_val);
        obj.display();
    }
}
