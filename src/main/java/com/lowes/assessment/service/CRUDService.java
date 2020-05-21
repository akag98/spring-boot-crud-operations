package com.lowes.assessment.service;

import java.io.Serializable;
import java.util.List;

import com.lowes.assessment.model.Employee;

public interface CRUDService<E> {
    E save(E entity);

	Employee getById(Serializable id);

	List<E> getAll();

	void delete(Serializable id);
}
