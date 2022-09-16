package com.containers;
public class Node<T> {
    T data;
    Node<T> next;


    public T getData()
    {
        return this.data;
    }

    Node(T data){
        this.data = data;
        this.next = null;
    }


    public Node getNext()
    {
        return this.next;
    }

    public void setNext(Node<T> node)
    {
        this.next = node;
    }

    public boolean hasNext()
    {
        return (this.next != null);
    }







}
