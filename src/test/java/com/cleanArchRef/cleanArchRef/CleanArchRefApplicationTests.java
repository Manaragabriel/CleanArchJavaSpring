package com.cleanArchRef.cleanArchRef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cleanArchRef.infrastructure.database.user.models.UserModel;
import com.cleanArchRef.infrastructure.database.user.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@DataJpaTest
class CleanArchRefApplicationTests {


	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private UserRepository userRepository;

	@Test
	void GiveAnUserToRepository_ThenCreateUserInDatabase() throws Exception{
		UserModel user = new UserModel();
		user.UserName = "tte";
		user.Email = "manara@teste.com";
		user.Password = "123456";
		user.IsActive = true;
		userRepository.save(user);
	}

}
