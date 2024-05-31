//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public List<Employee> findExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee worker : employees) {
            if (worker.getExperience() == experience) {
                result.add(worker);
            }
        }
        return result;
    }

    public List<Integer> findPhone(String name) {
        List<Integer> result = new ArrayList<>();
        for (Employee worker : employees) {
            if (worker.getName().equals(name)) {
                result.add(worker.getPhoneNumber());
            }
        }
        return result;
    }


    public Employee findServiceNumber(int serviceNumber) {
        for (Employee worker : employees) {
            if (worker.getServiceNumber() == serviceNumber) {
                return worker;
            }
        }
        return null;
    }

}

