package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cardno;
	private String nameoncard;
	private String pmtdate;
	private int amount;
	private String paymentmethod;
	private int cvv;
	private int exmonth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getNameoncard() {
		return nameoncard;
	}

	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}

	public String getPmtdate() {
		return pmtdate;
	}

	public void setPmtdate(String pmtdate) {
		this.pmtdate = pmtdate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExmonth() {
		return exmonth;
	}

	public void setExmonth(int exmonth) {
		this.exmonth = exmonth;
	}

	public int getExyear() {
		return exyear;
	}

	public void setExyear(int exyear) {
		this.exyear = exyear;
	}

	private int exyear;

}
