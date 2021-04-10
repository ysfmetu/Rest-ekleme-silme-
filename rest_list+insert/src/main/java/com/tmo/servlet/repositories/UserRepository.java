package com.tmo.servlet.repositories;

import com.tmo.servlet.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
