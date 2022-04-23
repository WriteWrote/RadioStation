package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.addon.AuthorDto;

import java.util.Set;

public class CreateAuthorValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(AuthorDto request) {
        Set<ConstraintViolation<AuthorDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
