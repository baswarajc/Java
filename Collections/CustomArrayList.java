package Collections;

import java.util.Arrays;

public class CustomArrayList<E> {

    public static final int initialCapacity  = 10;
    private int size = 0;
    Object [] elementArray = {};


    public CustomArrayList(){
        elementArray = new Object[initialCapacity];
    }


    public void add(E value){

        if(size == elementArray.length){
            ensureCapacity();
        }

        elementArray[size] = value;
        size++;

    }

    public E get(int index){

        if(index < 0 || index >= elementArray.length){
            throw new IndexOutOfBoundsException();
        }

        return (E) elementArray[index];
    }

    public void remove(int index){

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        for(int i = index; i< elementArray.length-1; i++){
            elementArray[i] = elementArray[i+1];
        }
        size--;
    }

    public void display(){

        System.out.print("Displaying all element: ");
        for(int i = 0; i< size; i++){
            System.out.print(elementArray[i]+" , ");
        }
        System.out.println();

    }

    public void ensureCapacity(){

        int newCapacity = elementArray.length *2 ;
        elementArray = (Arrays.copyOf(elementArray, newCapacity));

    }


}
