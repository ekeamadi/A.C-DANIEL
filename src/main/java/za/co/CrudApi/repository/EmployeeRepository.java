package za.co.CrudApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.CrudApi.entity.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Optional<Employee> findByFirstName(String firstName);
    Optional<Employee> findByIdNumber(String idNumber);
    Optional<Employee> findByBankAccountNumber(String bankAccountNumber);
    Optional<Employee> findByFirstNameOrIdNumberOrBankAccountNumber(String firstName,  String idNumber, String bankAccountNumber);


}
