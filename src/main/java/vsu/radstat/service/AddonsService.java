package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vsu.radstat.exception.exists.AlbumAlreadyExistsException;
import vsu.radstat.exception.exists.AuthorAlreadyExistsException;
import vsu.radstat.exception.exists.GenreAlreadyExistsException;
import vsu.radstat.exception.exists.SingerAlreadyExistsException;
import vsu.radstat.exception.notexists.AlbumNotExistsException;
import vsu.radstat.exception.notexists.AuthorNotExistsException;
import vsu.radstat.exception.notexists.SingerNotExistsException;
import vsu.radstat.model.entity.*;
import vsu.radstat.model.input.addon.*;
import vsu.radstat.repository.*;
import vsu.radstat.validator.*;

import javax.xml.validation.Validator;

@Service
@RequiredArgsConstructor
public class AddonsService {

}
