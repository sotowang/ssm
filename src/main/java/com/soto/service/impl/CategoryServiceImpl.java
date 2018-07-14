package com.soto.service.impl;

import java.util.List;

import com.soto.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soto.mapper.CategoryMapper;
import com.soto.pojo.Category;
import com.soto.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list(){
		return categoryMapper.list();
	}

	@Override
	public int total() {
		return categoryMapper.total();
	}

	@Override
	public List<Category> list(Page page) {
		return categoryMapper.list(page);
	}


}
