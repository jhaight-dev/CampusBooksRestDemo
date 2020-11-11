package org.wcci.campuslibraries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.campuslibraries.resources.Author;
import org.wcci.campuslibraries.resources.Campus;
import org.wcci.campuslibraries.storage.CampusStorage;

@Component
public class Populator implements CommandLineRunner {

    private CampusStorage campusStorage;
    private AuthorRepository authorRepo;
    public Populator(CampusStorage campusStorage, AuthorRepository authorRepo) {
        this.campusStorage = campusStorage;
        this.authorRepo = authorRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Campus columbus = new Campus("Columbus", "Java");
        Campus cleveland = new Campus("Cleveland", "C#");
        Campus pittsburg = new Campus("Pittsburg", "Java");
        campusStorage.saveCampus(columbus);
        campusStorage.saveCampus(cleveland);
        campusStorage.saveCampus(pittsburg);
        Author kathySierra = new Author("Kathy Sierra");
        Author bertBates = new Author("Bert Bates");
        Author ericFreeman = new Author("ericFreeman");
        Author elisabethRobson = new Author("Elisabeth Robson");
        authorRepo.save(kathySierra);
        authorRepo.save(bertBates);
        authorRepo.save(ericFreeman);
        authorRepo.save(elisabethRobson);
    }
}
