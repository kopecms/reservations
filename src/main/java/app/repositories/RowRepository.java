package app.repositories;

import app.models.Row;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kopec on 14.05.2017.
 */
public interface RowRepository extends CrudRepository<Row,Long> {
}
