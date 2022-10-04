package com.lucas.dscatalog.respositories;

import com.lucas.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositoy extends JpaRepository<Category, Long> {

}
