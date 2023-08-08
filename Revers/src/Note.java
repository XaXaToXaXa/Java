 public class Note {
        int id;
        String data;


        public Note(int id, String data) {
            this.id = id;
            this.data = data;
        }

            @Override
            public String toString() {
                return "ID = " + id + ":" + data + "!";
            }
        }
