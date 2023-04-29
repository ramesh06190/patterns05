package com.adapa.DMS.models;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author S555173 Pydi Venkata Satya Ramesh Adapa
 *
 */
@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	public int getTrainerId() {
		return trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	
	
	

}
