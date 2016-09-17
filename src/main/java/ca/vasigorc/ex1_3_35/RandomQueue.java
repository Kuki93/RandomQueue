package ca.vasigorc.ex1_3_35;

/**
 * Created by vgorcinschi on 17/09/16.
 */
public class RandomQueue<Item> {
    //number of items
    private int N;
    private Item[] array;

    public RandomQueue(int n) {
        N = 0;
        array = (Item[])new Object[n];
    }
    
    private void resize(int max){
        //move queue to a new array of size max
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
    
    public boolean isEmpty(){ return N == 0;}
    
    public void enqueue(Item item){
        //adding item to the end of the array
        if (N == array.length) resize(2*array.length);
        array[N++] = item;
    }

    //reomve and return a random Item
    public Item dequeue(){
        //index of the Item to be removed
        int index = StdRandom.uniform(0, N);
        Item r = array[index];
        //swap the items
        array[index] = array[N--];
        if (array.length>0 && N==array.length/4)resize(array.length/2);
        return r;
    }

    public Item sample(){
        return array[StdRandom.uniform(0, N)];
    }
}
