package com.deep.SubscribeUs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subscriberepository extends JpaRepository<subscribe, Long> {

}
