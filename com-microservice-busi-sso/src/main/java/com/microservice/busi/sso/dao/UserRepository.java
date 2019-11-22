package com.microservice.busi.sso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.busi.sso.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
