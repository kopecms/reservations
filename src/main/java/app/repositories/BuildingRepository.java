package app.repositories;

import app.models.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kopec on 29.04.2017.
 */

public interface BuildingRepository extends CrudRepository<Building, Long> {

}
