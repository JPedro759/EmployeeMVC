package br.fatecrl.Employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fatecrl.Employee.models.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private static final List<Employee> employees = new ArrayList<Employee>();

    public EmployeeController() {
        employees.add(new Employee(001, "Robert L. Stringer", "Developer FullStack", "Software development", 9859.57));
        employees.add(new Employee(002, "Francis Schott", "Designer UX/UI", "Design and User Experience", 6897.54));
        employees.add(new Employee(003, "Simon S. Richards", "Support analyst", "Technical Support", 4859.27));
        employees.add(new Employee(004, "Kathy G. Hoff", "HR Manager", "Human Resources", 7059.44));
        employees.add(new Employee(005, "Mark A. Garmon", "Data Scientist", "Project Management", 8250.15));
    }

    @GetMapping
    public String getEmployees(Model model) {
        model.addAttribute("employees", employees);

        return "employees";
    }
}
