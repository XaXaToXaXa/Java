package OOP.HW3;

import java.util.Iterator;

public class Linked implements Iterable<Element> {
    private Element first;
    private Element last;
    private int count = 0;

    public Linked addToList(Object obj) {
        if (first == null) {
            first = new Element(obj, null, null);
            last = first;
            count++;
            return this;
        } else {
            Element newElement = new Element(obj, null, last);
            last.setNext(newElement);
            last = newElement;
            count++;
            return this;
        }
    }

    public Element getElement(int index) {
        Element element = first;
        for (int i = 0; i < index; i++) {
            element = element.getNext();
        }
        return element;
    }


    public int getSize() {
        return count;
    }



    @Override
    public Iterator iterator() {
        return new Iterator<Element>() {
            Element current = new Element(null, first, null);

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
