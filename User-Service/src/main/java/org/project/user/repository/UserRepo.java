package org.project.user.repository;

import org.project.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String>{

	UserEntity findByUsername(String username);

}
