package com.bank.authorization.repository;

import com.bank.authorization.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для {@link UserEntity}
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
