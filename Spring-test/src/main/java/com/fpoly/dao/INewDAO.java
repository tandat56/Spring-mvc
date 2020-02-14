package com.fpoly.dao;

import java.util.List;

import com.fpoly.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}
