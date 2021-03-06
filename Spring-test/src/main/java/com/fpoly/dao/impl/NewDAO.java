package com.fpoly.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.fpoly.dao.INewDAO;
import com.fpoly.mapper.NewMapper;
import com.fpoly.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	@Override
	public List<NewModel> findAll() {
		String sql = "SELECT * FROM news";
		return query(sql, new NewMapper());
	}
}
