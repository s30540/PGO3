import java.time.LocalDate;

abstract  class Employee {

    private String name;
    private String lastName;
    private String address;
    private String email;
    private int yearOfEmployment;
    private String pesel;
    private int salary = 3000;

    public Employee(String name, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.yearOfEmployment = yearOfEmployment;
        this.pesel = pesel;
    }

    abstract int calculateSalary();

    public int getSalary() {
        return salary + ((LocalDate.now().getYear() - getYearOfEmployment()) * 1000);
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }
}