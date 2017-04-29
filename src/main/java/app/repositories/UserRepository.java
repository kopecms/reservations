package app.repositories;

import app.models.Urzytkownik;
import app.models.User;
import java.util.List;


public interface UserRepository {

    public void create(User user);


    public List<Urzytkownik> getAll();
}
