package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.addon.GenreDto;

import java.util.Set;

public class CreateGenreValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(GenreDto request) {
        Set<ConstraintViolation<GenreDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
