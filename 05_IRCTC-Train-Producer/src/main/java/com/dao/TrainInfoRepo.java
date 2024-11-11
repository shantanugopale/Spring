package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.TrainInfo;

public interface TrainInfoRepo extends JpaRepository<TrainInfo, Integer> {

}
