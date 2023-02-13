package com.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.StudentModel;
@Repository
public interface StudentRepo extends CrudRepository<StudentModel, Integer> {

}
