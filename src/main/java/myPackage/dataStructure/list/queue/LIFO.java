package myPackage.dataStructure.list.queue;

import java.util.List;


//------------------------------------- LIFO --------------------------------

//        List<Integer> list = new LinkedList<>(Arrays.asList(3,1,5,0,8,2,6,7,4,9));
//        LIFO lifo = new LIFO(list);
//
//
//        while( lifo.isNotEmpty() ){
//            System.out.println(lifo.consume());
//        }
//        System.out.println("LIFO size = " +lifo.getSize());
public class LIFO {
    List<Integer> queue;
    int queueSize;

    public Integer get(){
       return queue.get(queue.size() - 1);
    }

    public Integer consume(){
        if ( isQueueNullOrEmpty()) {
            return -1;
        }
        Integer toConsume = getLast();
        removeLast();
        queueSize--;
        return toConsume;
    }

    private boolean isQueueNullOrEmpty(){
        return queue == null || queue.isEmpty();
    }
    private Integer getLast(){
        return queue.get(queue.size()-1);
    }

    private void removeLast(){
        queue.remove(queue.size()-1);
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

    public LIFO(List<Integer> queue) {
        this.queue = queue;
        this.queueSize = queue.size();
    }
}
