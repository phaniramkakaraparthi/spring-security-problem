package phani.springframework.springsecurityproblem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {

    private long taskid;
    private String taskname;
}
