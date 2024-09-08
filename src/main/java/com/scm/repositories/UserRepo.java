package com.scm.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scm.entities.User;

// user repository are basicly used to perform crud operations on user data with database.

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    //extra methods db operations
    //custom query methods
    //custom finder methods

    //wap to find a prime number in a given range
    

}
