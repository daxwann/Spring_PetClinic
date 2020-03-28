package spring_petclinic;

import dax.springframework.spring_petclinic.SpringPetclinicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringPetclinicApplication.class)
class SpringPetclinicApplicationTests {

  @Test
  void contextLoads() {
  }

}
