package org.wcci.campuslibraries;

import org.springframework.data.repository.CrudRepository;
import org.wcci.campuslibraries.resources.Campus;

public interface CampusRepository extends CrudRepository<Campus, Long> {
}
