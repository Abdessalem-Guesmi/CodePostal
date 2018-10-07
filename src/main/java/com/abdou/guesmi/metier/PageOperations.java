package com.abdou.guesmi.metier;

import java.io.Serializable;
import java.util.List;

import com.abdou.guesmi.entities.Operation;

public class PageOperations implements Serializable{
	private List<Operation> operation;
	private int page;
	private int nbroperations;
	private int totalpages;
	private int totaloperations;
	public List<Operation> getOperation() {
		return operation;
	}
	public int getTotaloperations() {
		return totaloperations;
	}
	public void setTotaloperations(int totaloperations) {
		this.totaloperations = totaloperations;
	}
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNbroperations() {
		return nbroperations;
	}
	public void setNbroperations(int nbroperations) {
		this.nbroperations = nbroperations;
	}
	public int getTotalpages() {
		return totalpages;
	}
	public void setTotalpages(int totalpages) {
		this.totalpages = totalpages;
	}
	
}
