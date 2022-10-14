package com.example.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mainRepository  extends JpaRepository<testEntity,Long> {
}
