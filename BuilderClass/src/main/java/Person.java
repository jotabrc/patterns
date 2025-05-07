public class Person {

    private final String name;
    private final byte age;
    private final char gender;

    public Person(String name, byte age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private String name;
        private byte age;
        private char gender;

        public PersonBuilder() {
        }

        public PersonBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(final byte age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(final char gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.age, this.gender);
        }
    }
}
