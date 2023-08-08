import java.util.Iterator;
public class Revers {

        public static void main(String[] args) {
            SingleLinkList<Note> contactList = new SingleLinkList<>();

            contactList.addToEnd(new Note(1, "Жили были"));
            contactList.addToEnd(new Note(2, "Дед да Бабка"));
            contactList.addToEnd(new Note(3, "И была у них курочка Ряба"));
            contactList.addToEnd(new Note(4, "И снесла она яичко"));
            contactList.addToEnd(new Note(5, "Да не простое а золотое"));

            for (Object contact : contactList) {
                System.out.println(contact);
            }
            contactList.reverse();

            System.out.println("_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_-#-_");

            for (Object contact : contactList) {
                System.out.println(contact);
            }
        }



        /**
         * Класс списка
         *
         * @param <T>
         */
        public static class SingleLinkList<T> implements Iterable {
            ListItem<T> head;
            ListItem<T> tail;

            @Override
            public Iterator iterator() {
                return new Iterator<T>() {
                    ListItem<T> current = head;

                    @Override
                    public boolean hasNext() {
                        return current != null;
                    }

                    @Override
                    public T next() {
                        T data = current.data;
                        current = current.next;
                        return data;
                    }
                };
            }

            /**
             * Класс отдельного элемента
             *
             * @param <T>
             */
            private static class ListItem<T> {
                T data;
                ListItem<T> next;
            }

            // Проверка на то, пустая ли голова
            public boolean isEmpty() {
                return head == null;
            }

            // Заполнение списка
            public void addToEnd(T item) {

                // Выделение памяти для списка
                ListItem<T> newItem = new ListItem<>();
                newItem.data = item;

                // Если голова и хвост пустая, то присваеваем newItem
                if (isEmpty()) {
                    head = newItem;
                    tail = newItem;

                    // Если не пустая, то передаём элементу адрес и ставим его в хвост
                } else {
                    tail.next = newItem;
                    tail = newItem;
                }
            }

            // Метод разворота списка
            public void reverse() {
                if (!isEmpty() && head.next != null) { // Если не пусто и голова не равна нулю
                    tail = head;
                    ListItem<T> current = head.next;
                    head.next = null;
                    while (current != null) {
                        ListItem<T> next = current.next;
                        current.next = head;
                        head = current;
                        current = next;
                    }
                }
            }
        }
    }

