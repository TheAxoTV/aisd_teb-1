package myPackage.dataStructure.list.queue;

import java.util.List;


//------------------------------------- FIFOpriority--------------------------------
//        List<Integer> list = new LinkedList<>(Arrays.asList(3,1,5,0,8,2,6,7,4,9));
//        FIFOpriority fifo = new FIFOpriority(list);
//        fifo.add(1);
//        fifo.add(4);
//        fifo.add(8);
//
//
//        while( fifo.isNotEmpty() ){
//            System.out.println(fifo.consume());
//        }
//        System.out.println("FIFOpriority size = " +fifo.getSize());
public class FIFOpriority {
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
        queue.sort((int1, int2) -> int2.compareTo(int1));
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

    public FIFOpriority(List<Integer> queue) {
        queue.sort((integer, t1) -> t1.compareTo(integer));
        this.queue = queue;
    }
}
