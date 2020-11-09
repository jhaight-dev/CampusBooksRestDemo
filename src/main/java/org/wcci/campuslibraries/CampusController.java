package org.wcci.campuslibraries;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.campuslibraries.resources.Campus;

@RestController
public class CampusController {

    CampusRepository campusRepo;

    public CampusController(CampusRepository campusRepo) {
        this.campusRepo = campusRepo;
    }

    @GetMapping("/api/campuses")
    public Iterable<Campus> retrieveAllCampuses(){
        return campusRepo.findAll();
    }
    @GetMapping("/api/campuses/{id}")
    public Campus retrieveCampusById(@PathVariable Long id){
        return campusRepo.findById(id).get();
    }

}
