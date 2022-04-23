package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.request.RequestProgramDto;

import java.util.Set;

public class CreateProgramRequestValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(RequestProgramDto request) {
        Set<ConstraintViolation<RequestProgramDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
