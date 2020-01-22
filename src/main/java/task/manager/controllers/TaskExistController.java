package task.manager.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import task.manager.models.TaskDataModel;

@Slf4j
@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskExistController {
    @PostMapping("/day")
    public TaskDataModel dayEvent(@RequestBody TaskDataModel day) {
        log.debug("Day {}", day.getDateEvent());
        return day;
    }
}
