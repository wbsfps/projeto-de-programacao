package CadastroDeAlunos.main;

import CadastroDeAlunos.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de aluno: ");
        var quantityStudents = sc.nextInt();
        sc.nextLine();
        Student student;
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < quantityStudents; i++) {
            System.out.println("Informe o nome e idade do aluno: ");
            var name = sc.nextLine();
            var age = sc.nextInt();
            sc.nextLine();

            student = new Student(name, age);
            students.add(student);
        }

        students.forEach(System.out::println);
    }
}
