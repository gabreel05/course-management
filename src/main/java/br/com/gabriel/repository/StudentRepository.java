package br.com.gabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gabriel.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
