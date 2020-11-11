package org.wcci.campuslibraries;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wcci.campuslibraries.resources.Author;
import org.wcci.campuslibraries.resources.Campus;
import org.wcci.campuslibraries.storage.CampusRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {

    @Autowired
    private CampusRepository campusRepo;
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private AuthorRepository authorRepo;

    @Test
    public void campusRepoShouldSaveAndRetrieveCampusObjects() {
        Campus testCampus = new Campus("location", "techStack");

        campusRepo.save(testCampus);

        entityManager.flush();
        entityManager.clear();

        Campus retrievedCampus = campusRepo.findById(testCampus.getId()).get();

        assertThat(retrievedCampus).isEqualTo(testCampus);
    }
    @Test
    public void authorRepoShouldSaveAndRetrieveAuthorObjects(){
        Author testAuthor = new Author("authorName");
        authorRepo.save(testAuthor);

        entityManager.flush();
        entityManager.clear();

        Author retrievedAuthor = authorRepo.findById(testAuthor.getId()).get();

        assertThat(retrievedAuthor).isEqualTo(testAuthor);
    }
}
