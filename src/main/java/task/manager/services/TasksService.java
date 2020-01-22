package task.manager.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import task.manager.entities.Tasks;
import task.manager.repository.TasksRepository;

@RequiredArgsConstructor
@Service
public class TasksService {
    @NonNull
    private final TasksRepository tasksRepository;

    public void newTask(Tasks task) {
        tasksRepository.save(task);
    }
}
