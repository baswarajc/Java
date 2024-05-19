package Collections;

import java.util.Arrays;

public class ArrayListCustom<E> {

    public static  final int initialCapacity = 10;
    int size = 0;
    Object [] array = {};

    public ArrayListCustom(){
        array = new Object[initialCapacity];

    }

    public void add(E value){

        if(size == array.length){
            insureCapacity();
        }

        array[size] = value;
        size++;
    }

    public void remove(int index){
        if (index < 0 || index > size ){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i< array.length-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public E get(int index){
        if (index < 0 || index > size ){
            throw new IndexOutOfBoundsException();
        }
        return (E) array[index];
    }

    public void display(){
        for (int i = 0; i< size; i++) {
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }

    public void insureCapacity(){
        int newCapacity = array.length*2;
        array = (Arrays.copyOf(array,newCapacity ));

    }
}
