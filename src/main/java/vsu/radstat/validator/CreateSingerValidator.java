package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.addon.SingerDto;

import java.util.Set;

public class CreateSingerValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(SingerDto request) {
        Set<ConstraintViolation<SingerDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
