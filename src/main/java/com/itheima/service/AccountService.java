package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void add(Account account);

    void deleteById(int id);
}
