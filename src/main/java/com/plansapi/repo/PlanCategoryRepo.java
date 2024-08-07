package com.plansapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plansapi.entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer> {

}
