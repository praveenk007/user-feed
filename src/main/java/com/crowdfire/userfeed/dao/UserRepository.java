package com.crowdfire.userfeed.dao;

import com.crowdfire.userfeed.model.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Repository
public interface UserRepository extends ReactiveCrudRepository<Account, Long> {
}
