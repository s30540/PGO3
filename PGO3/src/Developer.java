import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    private List<Technology> technologyList = new ArrayList<>();

    public Developer(String name, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(name, lastName, address, email, pesel, yearOfEmployment);
    }

    public void addTechnology(Technology technology) {
        this.technologyList.add(technology);
    }

    @Override
    public int calculateSalary() {
        return getSalary() + technologyList.stream().mapToInt(Technology::getBonus).sum();
    }
}
