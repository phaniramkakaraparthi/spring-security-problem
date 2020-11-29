package phani.springframework.springsecurityproblem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.zalando.problem.spring.web.advice.security.SecurityAdviceTrait;

import java.util.Date;

@ControllerAdvice
public class SecurityExceptionHandler  implements SecurityAdviceTrait {

}
