package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl  implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

   /* {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        accountMapper = sqlSession.getMapper(AccountMapper.class);
    }*/

    @Override
    public List<Account> findAll() {

        return accountMapper.findAll();

    }

    @Override
    public void add(Account account) {

        accountMapper.insert(account);

    }

    @Override
    public void deleteById(int id) {
        accountMapper.delById(id);
    }
}
