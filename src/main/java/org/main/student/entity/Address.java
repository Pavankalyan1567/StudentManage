package org.main.student.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String vlgName;
	private String mandal;
	private String district;
	private String state;
	private int pincode;
	private String houseNo;
	private String streetName;
	
	private String addressType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getVlgName() {
		return vlgName;
	}
	public void setVlgName(String vlgName) {
		this.vlgName = vlgName;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Address(long id, String houseNo, String streetName, String vlgName, String mandal, String district,
			String state, int pincode, String addressType) {
		super();
		this.id = id;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.vlgName = vlgName;
		this.mandal = mandal;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.addressType = addressType;
	}
	public Address() {
		super();
	}
	
	@ManyToOne
	@JsonBackReference
	private Student student;
	public void setStudent(Student student2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
