package com.codewr.form.service;

import java.util.List;

import com.codewr.form.model.User;

/**
 *
 * @author codewr
 */
public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    void saveOrUpdate(User user);

    void delete(int id);

}
