
public class Task1 {
    public static void main(String[] args) {
        // Створення об'єктів різних класів
        Person person = new Person("Іван", 30);
        Student student = new Student("Марія", 20, "S12345");
        Teacher teacher = new Teacher("Петро", 40, "Математика");
        DepartmentHead head = new DepartmentHead("Олексій", 50, "Комп'ютерні науки");

        // Створення масиву типу суперкласу
        Person[] people = {person, student, teacher, head};

        // Виведення інформації про об'єкти з використанням методу show()
        for (Person p : people) {
            p.show();
            System.out.println();
        }
    }
}

// Клас Персона
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
    }
}

// Клас Студент, похідний від Персона
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void show() {
        super.show();
        System.out.println("Студентський ID: " + studentId);
    }
}

// Клас Викладач, похідний від Персона
class Teacher extends Person {
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void show() {
        super.show();
        System.out.println("Кафедра: " + department);
    }
}

// Клас ЗавідувачКафедри, похідний від Викладача
class DepartmentHead extends Teacher {
    private String department;

    public DepartmentHead(String name, int age, String department) {
        super(name, age, department);
        this.department = department;
    }

    public void show() {
        super.show();
        System.out.println("Завідувач кафедри: " + department);
    }
}
