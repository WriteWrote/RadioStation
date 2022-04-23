package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.addon.RecordDto;

import java.util.Set;

public class CreateRecordValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(RecordDto request) {
        Set<ConstraintViolation<RecordDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
