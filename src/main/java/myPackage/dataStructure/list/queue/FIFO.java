package myPackage.dataStructure.list.queue;

import java.util.List;

//------------------------------------- FIFO --------------------------------
//        List<Integer> list = new LinkedList<>(Arrays.asList(3,1,5,0,8,2,6,7,4,9));
//        FIFO fifo = new FIFO(list);
//
//
//        while( fifo.isNotEmpty() ){
//            System.out.println(fifo.consume());
//        }
//        System.out.println("FIFO size = " +fifo.getSize());
public class FIFO {
    List<Integer> queue;

    public Integer get(){
        if ( queue == null) {
            return -1;
        }
        return queue.get(0);
    }

    public Integer consume(){
        if ( queue == null || queue.isEmpty()) {
            return -1;
        }
        Integer first =  queue.get(0);
        queue.remove(0);
        return first;
    }

    public void add(Integer integer) {
        queue.add(integer);
    }

    public int getSize(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public boolean isNotEmpty(){
        return !queue.isEmpty();
    }

    public FIFO(List<Integer> queue) {
        this.queue = queue;
    }
}
