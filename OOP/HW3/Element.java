package OOP.HW3;


public class Element {
    Object obj;
    private Element next;
    private Element previous;

    public Element(Object obj, Element next, Element previous) {
        this.obj = obj;
        this.next = next;
        this.previous = previous;
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

    void setNext(Element element){
        next = element;
    }

    void setPrevious(Element element){
        previous = element;
    }

    public Element getPrevious() {
        return previous;
    }
    @Override
    public String toString() {
        return obj.toString();
    }
}
