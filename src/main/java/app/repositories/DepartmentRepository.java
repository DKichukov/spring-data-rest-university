package app.repositories;

import app.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

//@RestResource(exported = false)
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
