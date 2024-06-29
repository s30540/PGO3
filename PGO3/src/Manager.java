import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Goal> listOfGoals = new ArrayList<>();

    public Manager(String name, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(name, lastName, address, email, pesel, yearOfEmployment);
    }

    public void addGoals(Goal goal) {
        this.listOfGoals.add(goal);
    }

    @Override
    public int calculateSalary() {
        LocalDate currentDate = LocalDate.now();
        var finishedGoals = listOfGoals.stream().filter(goal -> goal.getDate().isBefore(currentDate) || goal.getDate().isEqual(currentDate)).toList();
        var finishedGoalsBonus = finishedGoals.stream().mapToInt(Goal::getBonus).sum();
        return getSalary() + finishedGoalsBonus;
    }
}
