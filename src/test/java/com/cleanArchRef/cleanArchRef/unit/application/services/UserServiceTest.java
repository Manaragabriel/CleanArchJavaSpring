package com.cleanArchRef.cleanArchRef.unit.application.services;

import com.cleanArchRef.application.services.UserService;
import com.cleanArchRef.domain.user.entities.User;
import com.cleanArchRef.infrastructure.database.user.models.UserModel;
import com.cleanArchRef.infrastructure.database.user.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    public UserRepository userRepository;

    @Autowired
    @InjectMocks
    public UserService userService;

    private UserModel _mockSaveUser;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        _mockSaveUser= new UserModel("Manara", "teste@teste.com", "1234", true);
        _mockSaveUser.Id = 1;

    }

    @Test
     void ShouldCreateUser(){
        User user = new User("Manara", "teste@teste.com", "1234", true);
        when(userRepository.save(any())).thenReturn(_mockSaveUser);
        User testUser = userService.createUser(user);

        assertEquals(testUser.getId(), 1);
    }
}
