package Assignment.Department.Repository;

import Assignment.Department.Entity.DepEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepRepo extends JpaRepository<DepEntity, Long> {


    List<DepEntity> findByName(String name);
}
