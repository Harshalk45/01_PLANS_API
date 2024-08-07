package com.plansapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plansapi.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
