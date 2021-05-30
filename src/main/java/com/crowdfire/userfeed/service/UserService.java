package com.crowdfire.userfeed.service;

import com.crowdfire.userfeed.dao.UserRepository;
import com.crowdfire.userfeed.dto.Account;
import com.crowdfire.userfeed.factory.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Service
public class UserService {

    @Autowired
    private DaoFactory daoFactory;

    public Mono<Account> create(Account account) {
        return daoFactory.getUserRepository().save(account.toModel())
                .map(Account::toDTO);
    }
}
