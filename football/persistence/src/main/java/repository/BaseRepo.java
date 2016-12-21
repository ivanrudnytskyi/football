package com.softserve.delivery.a8_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepo <T, ID extends Serializable> extends JpaRepository<T, ID> {

}
