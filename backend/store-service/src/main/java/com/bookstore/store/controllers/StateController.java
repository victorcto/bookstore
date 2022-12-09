package com.bookstore.store.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.store.entities.State;
import com.bookstore.store.services.StateService;

@RestController
@RequestMapping("/store/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping
    public ResponseEntity<State> save(@RequestBody State state) {
        return ResponseEntity.status(HttpStatus.CREATED).body(stateService.save(state));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        if (!stateService.delete(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estado não encontrado para exclusão.");
        }

        return ResponseEntity.status(HttpStatus.OK).body("Estado removido com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") Long id, @RequestBody State state) {
        if (!stateService.update(id, state)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estado não encontrado para atualização.");
        }

        return ResponseEntity.status(HttpStatus.OK).body("Estado atualizado com sucesso.");
    }

    @GetMapping
    public ResponseEntity<Page<State>> getAll(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(stateService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable(value = "id") Long id) {
        Optional<State> state = stateService.findById(id);

        if (!state.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estado não encontrado.");
        }

        return ResponseEntity.status(HttpStatus.OK).body(state.get());
    }

}
