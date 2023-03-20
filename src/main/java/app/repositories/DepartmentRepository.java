package app.repositories;

import app.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
