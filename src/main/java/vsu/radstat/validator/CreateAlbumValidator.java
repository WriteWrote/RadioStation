package vsu.radstat.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import vsu.radstat.model.input.addon.AlbumDto;

import java.util.Set;

public class CreateAlbumValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public boolean validate(AlbumDto request) {
        Set<ConstraintViolation<AlbumDto>> errors = validator.validate(request);

        return errors.isEmpty();
    }
}
