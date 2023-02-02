public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author b = (Author) other;
        return name.equals(b.name) && surname.equals(b.surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name) + java.util.Objects.hash(surname);
    }

}
