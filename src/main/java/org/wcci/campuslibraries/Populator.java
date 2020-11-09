package org.wcci.campuslibraries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.campuslibraries.resources.Campus;

@Component
public class Populator implements CommandLineRunner {

    CampusRepository campusRepo;

    public Populator(CampusRepository campusRepo) {
        this.campusRepo = campusRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Campus testCampus = new Campus("sample location", "sample techStack");

        campusRepo.save(testCampus);    }
}
