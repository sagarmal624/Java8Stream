package com.java;
//6(a) .Get a list of employees who earn less than 5000
// 6(b). Get the name of the youngest employee and oldest employee
// 6(c). Get the employee with maximum salary
// 6(d). Get the list of names of all the employees
// 6(e).Get a count of the number of employees in each department
// 6(f).Get the list of employees whose age is between 18 and 35 d
// 6(g).employee list using dept wise(group by dept
// 6(h).find the max sal dept wise
// 6(i).find the sum of all sal dept wise


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Operation_On_Employee_List {
    public static void main(String[] args) {
        Operation_On_Employee_List operation_on_employee_list = new Operation_On_Employee_List();
        List<Employee> empList = operation_on_employee_list.getEmpList();
        System.out.println("Get a list of employees who earn less than 5000");
        operation_on_employee_list.Qus_A(empList);
        System.out.println("Get the name of the youngest employee and oldest employee");
        operation_on_employee_list.Qus_B(empList);
        System.out.println(" Get the employee with maximum salary");
        operation_on_employee_list.Qus_C(empList);
        System.out.println(" Get the list of names of all the employees");
        operation_on_employee_list.Qus_D(empList);
        System.out.println(" Get a count of the number of employees in each department");
        operation_on_employee_list.Qus_E(empList);
        System.out.println(" Get the list of employees whose age is between 18 and 35 d");
        operation_on_employee_list.Qus_F(empList);
        System.out.println("employee list using dept wise(group by dept)");
        operation_on_employee_list.Qus_G(empList);
        System.out.println("find the max sal dept wise");
        operation_on_employee_list.Qus_H(empList);
        System.out.println("find the sum of all sal dept wise");
        operation_on_employee_list.Qus_I(empList);

    }

    public void Qus_A(List<Employee> empList) {
        empList.stream().filter(employee -> employee.getSalary() > 5000).collect(Collectors.toList()).forEach(System.out::println);
    }

    public void Qus_B(List<Employee> empList) {
        final Comparator<Employee> comp = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        System.out.println("oldest employee=" + empList.stream().max(comp).get().getName() + " ,youngest employee= " + empList.stream().min(comp).get().getName());

    }


    public void Qus_C(List<Employee> empList) {
        final Comparator<Employee> comp = (p1, p2) -> Integer.compare(p1.getSalary(), p2.getSalary());
        System.out.println(empList.stream().max(comp).get());
    }

    public void Qus_D(List<Employee> empList) {
        empList.stream().map(Employee::getName).forEach(System.out::println);

    }

    public void Qus_E(List<Employee> empList) {
        Map<String, Long> employeeMap = empList.stream().map(it -> it.getDepartmentName()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> finalMap = new LinkedHashMap<>();
        employeeMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);
    }

    public void Qus_F(List<Employee> empList) {
        empList.stream().filter(it -> it.getAge() > 18 && it.getAge() < 35).forEach(System.out::println);

    }

    public void Qus_G(List<Employee> empList) {
        Stream<Employee> stream = empList.stream();
        Map<String, List<Employee>> topEmployees = stream.collect(Collectors.groupingBy(e -> e.getDepartmentName()));
        System.out.println(topEmployees);
    }

    public void Qus_H(List<Employee> empList) {
        Stream<Employee> stream = empList.stream();
        Map<String, Employee> topEmployees = stream.collect(Collectors.groupingBy(i -> i.getDepartmentName(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())), Optional::get)));
        System.out.println(topEmployees);
    }

    public void Qus_I(List<Employee> empList) {
        Stream<Employee> stream = empList.stream();
        Map<String, Integer> topEmployees = stream.collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.summingInt(Employee::getSalary)));
        System.out.println(topEmployees);
    }

    public List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<Employee>();
        IntStream.range(0, 10).forEach(i -> {
            Employee employee = null;
            if (i % 2 == 0) {
                employee = new Employee("emp " + i, "Science Dept", "Emp-" + i, i * 10, i * 3000);
            } else if (i % 3 == 0) {
                employee = new Employee("emp " + i, "Computer Dept", "Emp-" + i, i * 10, i * 3000);
            } else if (i % 5 == 0) {
                employee = new Employee("emp " + i, "Arts Dept", "Emp-" + i, i * 10, i * 3000);
            } else {
                employee = new Employee("emp " + i, "Commerse Dept", "Emp-" + i, i * 10, i * 3000);
            }
            empList.add(employee);
        });
        return empList;
    }
}
