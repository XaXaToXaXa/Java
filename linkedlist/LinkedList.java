package linkedlist;
import java.util.Iterator;


public class LinkedList implements Iterable<Element> {
    private Element head;
    private Element tail;
    private int count = 0;

    public void add(Object obj){
        if (head==null){
            head = new Element(obj, null, null);
            tail = head;
            count++;
            
        } 
        else {
            Element newEl = new Element(obj, null, tail);
            tail.setNext(newEl);
            tail = newEl;
            count++;
        }
    }

    public Element getEl(int index){
        Element element = head;
        for (int i=0;i<index;i++){
            element = element.getNext();
        }
        return element;
    }


    public int getSize() {
        return count;
    }


    public void remove(int index){

        Element current = getEl(index);
        Element next = current.getNext();
        Element prev = current.getPrevious();

        if (index == 0){
            head = next;
            if (tail == current){
                tail = null;
            }
        }

        if (index == count - 1){
            tail = prev;
            if (head == current){
                head = null;
            }
        }

        count--;

        if (next != null){
            next.setPrevious(prev);
        }

        if (prev != null){
            prev.setNext(next);
        }

    }

    @Override
    public Iterator iterator() {
        return new Iterator<Element>() {
            Element current = new Element(null, head, null);

            @Override
            public boolean hasNext() {
                return current.getNext() != null;
            }

            @Override
            public Element next() {
                current = current.getNext();
                return current;
            }
        };
    }

}
