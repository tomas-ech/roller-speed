package com.school.roller_speed.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.roller_speed.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    @Override
    default UserModel getById(Long arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }


    @Override
    default List<UserModel> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    default void deleteById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    default Optional<UserModel> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

}
