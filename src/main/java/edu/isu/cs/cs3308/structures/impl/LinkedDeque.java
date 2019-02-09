package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;

public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E>{

    //private DoublyLinkedList<E> DLL = new DoublyLinkedList<>();


    /*
    * Constructor for a LinkedDequeue
    * */
    public LinkedDeque(){

    }

    /**
     * @return The value of the last element of the deque (without removing it),
     * or null if the deque is empty.
     */
   public E peekLast() {
        return DLL.last();
    }

    /**
     * Inserts the given element into the front of the deque, unless the
     * provided value is null.
     *
     * @param element Element to be inserted to the front of the deque, nothing
     * happens if the value is null.
     *
     */
    public void offerFirst(E element) {
        DLL.addFirst(element);
    }

    /**
     * @return The value of the last item in the Deque and removes that value
     * from the deque, if the deque was empty null is returned.
     */
    public E pollLast() {
        E toReturn = null;

        if (DLL.last() != null) {
            toReturn = DLL.removeLast();
        }

        return toReturn;
    }
}



