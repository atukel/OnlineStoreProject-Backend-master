package com.eshop.eshopManagerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.eshopManagerAPI.models.category;


@Repository
public interface categoryRepository extends JpaRepository<category, Long>  {

    category findBycategoryName(String categoryName);
    category findByid(Long id);

    List<category> findAll();
	boolean existsBycategoryName(String categoryName);

}
