package org.hcl.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String lastName;
	private String bloodGroup;
	private String city;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_blood",joinColumns= {@JoinColumn(name="userId")},inverseJoinColumns= {@JoinColumn(name="bid")})
	private Set<BloodGroup> bloodGroups=new HashSet();
	public Users() {
	
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Set<BloodGroup> getBloodGroups() {
		return bloodGroups;
	}
	public void setBloodGroups(Set<BloodGroup> bloodGroups) {
		this.bloodGroups = bloodGroups;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}public void add(BloodGroup bg) {
		
		bloodGroups.add(bg);
	}
	
	

}

