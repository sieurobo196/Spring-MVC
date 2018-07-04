package com.codewr.form.dao;

import java.util.List;

import com.codewr.form.model.User;

/**
 *
 * @author codewr
 */
public interface UserDao {

    User findById(Integer id);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void delete(Integer id);

}
