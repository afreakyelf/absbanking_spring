package com.spring.boot.transaction;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface TransactionRepository extends CrudRepository<Transaction, Integer>{
    
    @Query(value = "SELECT * FROM transaction2 WHERE from_acc = ?1 or to_acc= ?1 ", nativeQuery = true)
     List<Transaction> findbyacc(int number);
    
    @Modifying
    @Transactional
    @Query(value="update maintable set balance=balance+?2 where regd_id=( select * from (select m.regd_id from details d,maintable m where d.acc_no=?1 && m.regd_id=d.reg_id ) tablex)",nativeQuery = true)
    void addAmount(long acc_no,long amount);
    
    @Modifying
    @Transactional
    @Query(value="update maintable set balance=balance-?2 where regd_id=( select * from (select m.regd_id from details d,maintable m where d.acc_no=?1 && m.regd_id=d.reg_id ) tablex)",nativeQuery = true)
    void delAmount(long acc_no,long amount);
}
