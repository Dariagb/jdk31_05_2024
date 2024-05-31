public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(new Employee("Екатерина", 3, 123, 78923456));
        directory.addEmployee(new Employee("Владимир", 2, 876, 874321));
        directory.addEmployee(new Employee("Елена", 1, 4567, 789778));
        directory.addEmployee(new Employee("Илья", 7, 872, 87345678));

        System.out.println(directory.findServiceNumber(876));
        System.out.println(directory.findExperience(2));

        System.out.println(directory.findPhone("Илья"));
    }
}