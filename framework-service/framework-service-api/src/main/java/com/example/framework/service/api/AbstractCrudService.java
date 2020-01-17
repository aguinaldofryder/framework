package com.example.framework.service.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @autor Aguinaldo Fryder <aguinaldofryder@hotmail.com
 * @since 16/01/2020
 * @version 1.0
 */
public interface AbstractCrudService<T> {

    /**
     * Retorna uma página de registros
     */
    Page<T> search(String search, Pageable pageable);

    /**
     * Busca um registro pelo ID
     */
    T findById(Integer id);

    /**
     * Salva um novo registro
     */
    T save(T entity);

    /**
     * Atualiza um registro
     */
    T update(Integer id, T entity);

    /**
     * Exclui um registro
     */
    void delete(Integer id);

}
