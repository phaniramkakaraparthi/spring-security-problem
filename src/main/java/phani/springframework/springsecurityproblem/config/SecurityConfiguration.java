package phani.springframework.springsecurityproblem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.zalando.problem.spring.web.advice.security.SecurityProblemSupport;

@Configuration
@EnableWebSecurity
@Import(SecurityProblemSupport.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private SecurityProblemSupport securityProblemSupport;

    SecurityConfiguration(SecurityProblemSupport securityProblemSupport){
        this.securityProblemSupport = securityProblemSupport;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Other security-related configuration
        http.exceptionHandling()
                .authenticationEntryPoint(securityProblemSupport)
                .accessDeniedHandler(securityProblemSupport);
    }
}
