package com.example.framework.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @autor Aguinaldo Fryder <aguinaldofryder@hotmail.com
 * @since 16/01/2020
 * @version 1.0
 */
@NoRepositoryBean
public interface GenericRepository<T> extends JpaRepository<T, Integer>, JpaSpecificationExecutor<T>{

}
