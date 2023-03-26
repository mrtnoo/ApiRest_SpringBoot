package com.sv.repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.models.User;

@Repository
public interface InterfaceUser extends CrudRepository<User, Integer> {

}
