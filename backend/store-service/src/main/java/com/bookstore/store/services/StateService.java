package com.bookstore.store.services;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bookstore.store.entities.State;
import com.bookstore.store.repositories.StateRepository;
import com.bookstore.store.utils.Util;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    @Transactional
    public State save(State state) {
        state.setCreationDate(new Date());
        return stateRepository.save(state);
    }

    @Transactional
    public boolean delete(Long id) {
        Optional<State> state = stateRepository.findById(id);

        if (!state.isPresent()) {
            return false;
        }

        stateRepository.delete(state.get());
        return true;
    }

    @Transactional
    public boolean update(Long id, State obj) {
        Optional<State> state = stateRepository.findById(id);

        if (!state.isPresent()) {
            return false;
        }

        BeanUtils.copyProperties(obj, state.get(), Util.getNullPropertyNames(obj));
        state.get().setUpdateDate(new Date());
        stateRepository.save(state.get());

        return true;
    }

    public Page<State> findAll(Pageable pageable) {
        return stateRepository.findAll(pageable);
    }

    public Optional<State> findById(Long id) {
        return stateRepository.findById(id);
    }
    
}
