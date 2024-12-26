package elective_2.library;

import java.util.Objects;

public class Reader {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;
        return Objects.equals(name, reader.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
