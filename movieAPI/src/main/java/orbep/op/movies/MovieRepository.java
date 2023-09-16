package orbep.op.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/*
 *
 * This is the repository class. It is responsible for handling the data and returning it to the service class.
 * This is the class that actually communicates with the database.
 *
 * */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


    Optional<Movie> findMovieByImdbId(String imdbId);

}
