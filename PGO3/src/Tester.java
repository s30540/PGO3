import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes = new ArrayList<>();

    public Tester(String name, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(name, lastName, address, email, pesel, yearOfEmployment);
    }

    public void addTestType(String testType) {
        this.testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        return getSalary() + (testTypes.size() * 300);
    }
}
