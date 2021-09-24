package com.epam.mysite.engine.database.repository.content.impl;


import com.epam.mysite.entity.content.ServiceSubcategory;

import java.util.List;

public interface IServiceSubcategoryRepository {
    List<ServiceSubcategory> findAllByCategory(String category);
}
