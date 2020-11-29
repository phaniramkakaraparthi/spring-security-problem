package phani.springframework.springsecurityproblem.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;

@ControllerAdvice
public class ProblemHandler implements ProblemHandling  {
}
