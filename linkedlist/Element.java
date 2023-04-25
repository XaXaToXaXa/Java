package linkedlist;

public class Element {
    
    Object obj;
    private Element next;
    private Element prev;

    public Element(Object obj,Element next, Element prev) {
        this.obj = obj;
        this.next = next;
        this.prev = prev;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element element){
        next = element;
    }

    void setPrevious(Element element){
        prev = element;
    }

    public Element getPrevious() {
        return prev;
    }
    @Override
    public String toString() {
        return obj.toString();
    }
}
