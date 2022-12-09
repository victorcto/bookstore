package com.bookstore.store.services;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bookstore.store.entities.Address;
import com.bookstore.store.repositories.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public Address save(Address address) {
        address.setCreationDate(new Date());
        return addressRepository.save(address);
    }

    @Transactional
    public boolean delete(Long id) {
        Optional<Address> address = addressRepository.findById(id);

        if (!address.isPresent()) {
            return false;
        }

        addressRepository.delete(address.get());
        return true;
    }

    @Transactional
    public boolean update(Long id, Address obj) {
        Optional<Address> address = addressRepository.findById(id);

        if (!address.isPresent()) {
            return false;
        }

        BeanUtils.copyProperties(obj, address);
        address.get().setUpdateDate(new Date());
        addressRepository.save(address.get());

        return true;
    }

    public Page<Address> findAll(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    public Optional<Address> findById(Long id) {
        return addressRepository.findById(id);
    }
    
}
