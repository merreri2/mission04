package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {

    private LinkedStack<E> redStack = new LinkedStack<>();
    private LinkedStack<E> blueStack = new LinkedStack<>();

    /**
     * Adds the element to the top of the Red Stack, unless the element is null.
     *
     * @param element Element to add.
     */
    public void pushRed(E element){
        if (element != null) {
            redStack.push(element);
        }
    }

    /**
     * Adds the element to the top of the Blue Stack, unless the element is
     * null.
     *
     * @param element Element to add.
     */
    public void pushBlue(E element){
        if (element != null) {
            blueStack.push(element);
        }
    }

    /**
     * Removes the element at the top of the Red Stack and returns its value,
     * unless the Red Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Red Stack is
     * empty
     */
    public E popRed(){
        if (!redStack.isEmpty()) {
            return redStack.pop();
        }else {
            return null;
        }
    }

    /**
     * Removes the element at the top of the Blue Stack and returns its value,
     * unless the Blue Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Blue Stack is
     * empty
     */
    public E popBlue(){
        if (!blueStack.isEmpty()) {
            return blueStack.pop();
        } else {
            return null;
        }
    }

    /**
     * Returns the value at the top of the Red Stack.
     *
     * @return The value at the top of the Red Stack, or null if the Red Stack
     * is emtpy
     */
    public E peekRed(){
        if (!redStack.isEmpty()) {
            return redStack.peek();
        } else {
            return null;
        }
    }

    /**
     * Returns the value at the top of the Blue Stack.
     *
     * @return The value at the top of the Blue Stack, or null if the Blue Stack
     * is emtpy
     */
    public E peekBlue(){
        if (!blueStack.isEmpty()) {
            return blueStack.peek();
        } else {
            return null;
        }
    }

    /**
     * @return Current size of the Blue Stack
     */
    public int sizeBlue(){
        return blueStack.size();
    }

    /**
     * @return Current size of the Red Stack
     */
    public int sizeRed(){
       return redStack.size();
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    public boolean isBlueEmpty(){
       return blueStack.isEmpty();
    }

    /**
     * @return True if the Red Stack is empty, false otherwise
     */
    public boolean isRedEmpty(){
       return redStack.isEmpty();
    }
}