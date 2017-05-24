package io.pivotal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by benwilcock on 11/05/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PcfAxonCqrsCommandSideApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ITCheckApplicationContextLoadsTest {

    @Test
    public void contextLoads() {
    }
}
