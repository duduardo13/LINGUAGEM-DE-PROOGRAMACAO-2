// Classe Person (superclasse)
class Person {
    private String name;
    private String address;

    // Construtor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    // Método toString
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

// Classe Student que estende Person
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Construtor
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getters e Setters
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // Método toString
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}

// Classe Staff que estende Person
class Staff extends Person {
    private String school;
    private double pay;

    // Construtor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Getters e Setters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // Método toString
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}

// Classe de Teste
public class TestPerson {
    public static void main(String[] args) {
        // Testando a classe Student
        Student student = new Student("John Doe", "123 Street", "Computer Science", 2023, 1500.50);
        System.out.println(student.toString()); // Deve exibir os detalhes do estudante

        student.setProgram("Data Science");
        student.setYear(2024);
        student.setFee(1600.75);
        System.out.println("Updated Student: " + student.toString()); // Exibe as informações atualizadas do estudante

        // Testando a classe Staff
        Staff staff = new Staff("Jane Smith", "456 Avenue", "High School", 2500.80);
        System.out.println(staff.toString()); // Deve exibir os detalhes do staff

        staff.setSchool("University");
        staff.setPay(3000.90);
        System.out.println("Updated Staff: " + staff.toString()); // Exibe as informações atualizadas do staff
    }
}
	