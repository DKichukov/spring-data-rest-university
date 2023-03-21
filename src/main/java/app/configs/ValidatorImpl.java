package app.configs;

import app.entities.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Configuration
public class ValidatorImpl implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (target instanceof Student) {
            Student student = (Student) target;
            if (student.getFirstName() == null || student.getFirstName().isEmpty()) {
                errors.rejectValue("firstName", "", "First name required");
            }
        }
    }
}
