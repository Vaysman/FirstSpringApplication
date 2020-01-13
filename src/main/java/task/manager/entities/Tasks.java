package task.manager.entities;

import javax.persistence.*;


@Entity
@Table(name = "tasks")
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taskId;
	
	@Column(name = "task_title")
	private String taskTitle;
	
	@Column(name = "task_description")
	private String taskDescription;
	
	@Column(name = "task_start")
	private String taskStart;
	
	@Column(name = "task_time")
	private Integer taskTime;
	
	@Column(name = "group_id")
	private Integer groupId;

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	@Override
	public String toString() {
		return "Tasks [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskDescription=" + taskDescription
				+ ", taskStart=" + taskStart + ", taskTime=" + taskTime + ", groupId=" + groupId + "]";
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskStart() {
		return taskStart;
	}

	public void setTaskStart(String taskStart) {
		this.taskStart = taskStart;
	}

	public Integer getTaskTime() {
		return taskTime;
	}

	public void setTaskTime(Integer taskTime) {
		this.taskTime = taskTime;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
}
