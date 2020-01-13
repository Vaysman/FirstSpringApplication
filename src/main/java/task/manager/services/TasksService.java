package task.manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task.manager.entities.Tasks;
import task.manager.repository.TasksRepository;

@Service
public class TasksService {
	@Autowired
	private final TasksRepository tasksRepository;
	
	public TasksService(TasksRepository tasksRepository) {
		this.tasksRepository = tasksRepository;
	}
	
	public void newTask(Tasks task) {
		tasksRepository.save(task);
	}
}
