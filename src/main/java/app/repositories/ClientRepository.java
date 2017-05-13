package app.repositories;

import app.models.Building;
import app.models.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by albert on 13.05.17.
 */
public interface ClientRepository extends CrudRepository<Client, Long> {
}
