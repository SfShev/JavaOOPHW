package GenealogicalTree;

    public class People {
        private String name;
        private String gender;
        private int age;

        public People(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public People(String name) {
            this(name, "", 0);
        }

        public String getInfo() {
            return "Human: " + this.name + ", " + this.age + " y.o.";
        }

        public String getName() {
            return name;
        }
    }

