package com.zazi.api.service
import com.zazi.api.entity.Category

interface CategoryService { 
    List<Category>findAll()   

    Category findById(int id)
    Category save(Category category)
    Category update(Category category, int id)
    Category delete(int id)
   
     }