package za.co.CrudApi.service;

import za.co.CrudApi.entity.Employee;

import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployeeDetails(Employee employee);

    Employee updateEmployeeDetails(Employee employee);

    Optional<Employee> searchByFirstNameOrIdNumberOrBankAccountNumber(String firstName, String idNumber, String bankAccountNumber);

}
