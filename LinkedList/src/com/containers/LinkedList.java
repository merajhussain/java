package com.containers;

public  class LinkedList <T> {

    private Node<T> head;
    private long  size;

    public LinkedList()
    {
        head= null;
        size=0;
    }
    public long getSize(){
        return size;
    }

    public void add(T data) {
        if (head == null) {
            head = new Node<T>(data);


        } else {
            var node = new Node<T>(data);
            node.setNext(head);
            head = node;

        }
        size++;
    }

    public void printList() {
        System.out.println();
        var cur = head;
        while (cur != null) {
            System.out.print(cur.getData());
            cur = cur.getNext();
            if(cur != null){
                System.out.print("->");
            }
        }
    }

    public void reverse(){
        var cur = head;
        Node<T> prev = null;
        Node<T> next = null;
        while(cur != null)
        {
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }
        head = prev;
    }
    public void remove(int index)
    {
        if(index >= size || index < 0) return;

        if(index == 0){

            head = head.getNext();
            size--;
            return;
        }
        if(index == size-1){
            var cur = head;
            Node<T> prev = null;
            Node<T> next = null;
             while(cur.getNext() != null)
            {
                 next = cur.getNext();
                 prev = cur;
                 cur = next;

            }

             if(prev != null) {
                 prev.setNext(null);
                 size--;
             }

        }
        else
        {
            var cur = head;
            Node<T> prev = null;
            Node<T> next = null;
           for(int i=0;i<index;i++)
           {
               next = cur.getNext();
               prev = cur;
               cur = next;
           }

           if(cur!=null){
               prev.setNext(cur.getNext());
               size--;
           }
        }






    }

}

