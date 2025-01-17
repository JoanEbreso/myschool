package com.myschool.data.repository;

import com.myschool.data.entity.NextOfKin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NOKRepository extends JpaRepository<NextOfKin, Long> {
}
