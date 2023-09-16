package orbep.op.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesWebsiteApplication.class, args);
    }

    /*	The method apiRoot lets Spring (the framework) know that this method should handle any GET requests sent to the localhost:8080 url.
     * The GetMapping("/") annotation tells Spring that this method should handle any GET requests sent to the localhost:8080/whats_in_the_annotation_parameter url.
     * */

//	@GetMapping("/root")
//	public String apiRoot() {
//		return "Hello World";
//	}


}
