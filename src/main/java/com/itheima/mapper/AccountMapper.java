package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> findAll();

    void insert(Account account);

    void delById(int id);

}
