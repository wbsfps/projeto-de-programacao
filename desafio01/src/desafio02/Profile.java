package desafio02;

public class Profile {
    private String name;

    public Profile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
