package com.soto.service;

import java.util.List;

import com.soto.pojo.Category;
import com.soto.util.Page;

public interface CategoryService {

	List<Category> list();

	int total();

	List<Category> list(Page page);
}
