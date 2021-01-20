package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USR_REGISTER")
public class UserEntity {

    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email_id")
    private String email;
    
    @Id
    @Column(name="mob_num")
    private String mobnum;
    
    @Column(name="password")
    private String password;
    
    @Column(name="referral_code")
    private String referralcode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobnum() {
		return mobnum;
	}

	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReferralcode() {
		return referralcode;
	}

	public void setReferralcode(String referralcode) {
		this.referralcode = referralcode;
	}

}