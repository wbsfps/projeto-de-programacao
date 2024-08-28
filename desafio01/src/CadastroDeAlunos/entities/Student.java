package CadastroDeAlunos.entities;

public class Student {
    private String name;
    private Integer age;

    public Student(){}
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d", name, age);
    }
}
