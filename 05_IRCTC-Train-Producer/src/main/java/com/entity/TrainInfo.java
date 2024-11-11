package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrainInfo {

	@Id
	private int trainNo;
	@Column(unique = true)
	private String trainName;
	private String trainSource;
	private String trainDestination;
	private String currentStation;
	private double trainTime;

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainSource() {
		return trainSource;
	}

	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}

	public String getTrainDestination() {
		return trainDestination;
	}

	public void setTrainDestination(String trainDestination) {
		this.trainDestination = trainDestination;
	}

	public String getCurrentStation() {
		return currentStation;
	}

	public void setCurrentStation(String currentStation) {
		this.currentStation = currentStation;
	}

	public double getTrainTime() {
		return trainTime;
	}

	public void setTrainTime(double trainTime) {
		this.trainTime = trainTime;
	}

	@Override
	public String toString() {
		return "TrainInfo [trainNo=" + trainNo + ", trainName=" + trainName + ", trainSource=" + trainSource
				+ ", trainDestination=" + trainDestination + ", currentStation=" + currentStation + ", trainTime="
				+ trainTime + "]";
	}

}
