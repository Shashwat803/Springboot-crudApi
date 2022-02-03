package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

//    @Modifying
//    @Query(value="DELETE FROM Employee E WHERE E.id= :employeeId")
    void deleteById( Long employeeId);

    Optional<Employee> findEmployeeById(Long id);
}
