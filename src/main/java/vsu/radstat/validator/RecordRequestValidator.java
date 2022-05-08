package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.request.RequestDto;

import java.util.Set;

public class RecordRequestValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(RequestDto request) {
        Set<ConstraintViolation<RequestDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
