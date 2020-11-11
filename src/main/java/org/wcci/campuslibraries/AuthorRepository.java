package org.wcci.campuslibraries;

import org.springframework.data.repository.CrudRepository;
import org.wcci.campuslibraries.resources.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
