package task.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task.manager.entities.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long> {
}
