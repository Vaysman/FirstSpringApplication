package task.manager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import task.manager.models.TaskDataModel;

@RestController
public class TaskExistController {
	@RequestMapping(method=RequestMethod.POST, value="/day", consumes = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public String dayEvent(@RequestBody TaskDataModel day) {
		System.out.println(day.getDateEvent());
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(day.getDateEvent());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
