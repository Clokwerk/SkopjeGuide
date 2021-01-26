package mk.ukim.finki.skopjeguide.web.controller;


import mk.ukim.finki.skopjeguide.repository.HospitalRepository;
import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * This is Rest Controller in Java that is mapped on the path written in RequestMapping annotation.
 * This path is used like a default path for every mapped method in this class.
 */
@RestController
@RequestMapping("/api/hospitals")
@CrossOrigin("*")
public class HospitalController {
    /**
     * Repository is injected using this variable and the constructor.
     */
    private HospitalRepository repository;
    /**
     * Constructor with parameter.
     *
     * @param repository
     */
    public HospitalController(HospitalRepository repository) {
        this.repository = repository;
    }
    /**
     * Getter that returns all values that are different than null.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity getAllHospitals() {
        return ResponseEntity.ok(this.repository.findByNameNotNull());
    }
}
