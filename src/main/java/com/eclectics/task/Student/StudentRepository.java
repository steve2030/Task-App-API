package com.eclectics.task.Student;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Id> {
}
