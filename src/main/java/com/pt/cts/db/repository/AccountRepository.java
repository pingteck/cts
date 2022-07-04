package com.pt.cts.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pt.cts.db.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
