package com.example.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.framework.repository.api.GenericRepository;
import com.example.framework.service.api.AbstractCrudService;

/**
 * @autor Aguinaldo Fryder <aguinaldofryder@hotmail.com
 * @since 16/01/2020
 * @version 1.0
 */
@Service
public class AbstractCrudServiceImpl<T> implements AbstractCrudService<T> {

    @Autowired
    private GenericRepository<T> repository;

    @Override
    public Page<T> search(String search, Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public T findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(Integer id, T entity) {
        repository.findById(id).orElseThrow(() -> new RuntimeException("Nenhum registro encontrado com o ID " + id));
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        final T saved =  repository.findById(id).orElseThrow(() -> new RuntimeException("Nenhum registro encontrado com o ID " + id));
        repository.delete(saved);

    }

}
