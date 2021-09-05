package com.company.SinglyLinkedList;

//1. Create a new Node
//2. Insert a node in the list
//3. Print the list (traversal)
//4. Search for a specific node
//5. Delete a node
//6. Reversing the list

class SinglyLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void insertEnd(SinglyLinkedList list, int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
            list.head = new_node;
        else
        {
            Node temp = list.head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    void insertBeg(SinglyLinkedList list, int data)
    {
        Node new_node = new Node(data);
        if(list.head == null)
            list.head = new_node;
        else
        {
            new_node.next = list.head;
            list.head = new_node;
        }
    }

    void searchNode(SinglyLinkedList list, int key)
    {
        Node temp = list.head;
        boolean found = false;
        while(temp!=null)
        {
            if(temp.data == key)
            {
                found = true;
            }
            temp = temp.next;
        }
        if(found)
            System.out.println("Found "+key+" in the list!");
        else
            System.out.println("Not found "+key+" in the list!");
    }

    void deleteNode(SinglyLinkedList list, int key)
    {
        Node temp = list.head;
        Node prevNode = null;

        //If the key doesn't exist
        if(list.head == null)
            System.out.println("List is empty!");
        //If the key is the head node
        if(temp!=null && temp.data == key)
        {
            list.head = temp.next;
            System.out.println("Deleted "+key+" from the head!");
        }
        //If the key is anywhere else
        while(temp!=null && temp.data != key)
        {
            prevNode = temp;
            temp = temp.next;
        }
        if(temp!=null)
        {
            if(prevNode !=null )
                prevNode.next = temp.next;
            System.out.println("Deleted "+key+" from the list!");
        }
    }

    void printList(SinglyLinkedList list)
    {
        Node current = list.head;
        while(current!=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void reverseList(SinglyLinkedList list)
    {
        Node prev = null;
        Node current = list.head;
        Node next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
    }

}

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertEnd(myList, 10);
        myList.insertEnd(myList, 20);
        myList.insertEnd(myList, 30);
        myList.printList(myList);
        myList.insertBeg(myList,40);
        myList.insertBeg(myList,50);
        myList.printList(myList);
        myList.searchNode(myList,100);
        myList.deleteNode(myList, 20);
        myList.printList(myList);
        myList.reverseList(myList);
        myList.printList(myList);
    }
}
