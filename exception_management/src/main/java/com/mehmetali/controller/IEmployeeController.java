package com.mehmetali.controller;

import com.mehmetali.dto.DtoEmployee;
import com.mehmetali.model.RootEntity;

public interface IEmployeeController {

	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
