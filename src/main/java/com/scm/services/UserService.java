package com.scm.services;
import com.scm.entities.User;
import java.util.Optional;
import java.util.List;
import com.scm.repositories.UserRepo;



// user service interface is used to define the contract for the user service.
// it is used to define the methods that the user service will implement.
public interface UserService {

    // save user
    User saveUser(User user);

    // get user by id
    Optional<User> getUserById(String id);

    // get all users
    List<User> getAllUsers();

    // update user
    User updateUser(User user);

    // delete user
    void deleteUser(String id);

    //is user exists
    boolean isUserExists(String id);

    // get user by email
    Optional<User> getUserByEmail(String email);




}
