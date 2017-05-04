package app;


import app.models.User;
import app.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUsersRepository() throws Exception {
        User user = userRepository.findOne(new Long(1));
        Assert.assertEquals(new Long(user.getId()),new Long(1));

    }

}