package com.cleanArchRef.infrastructure.database.user.repositories;

import com.cleanArchRef.infrastructure.database.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
