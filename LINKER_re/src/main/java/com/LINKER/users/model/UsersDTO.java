package com.LINKER.users.model;

import java.sql.Timestamp;

public class UsersDTO {
	private int user_id;
	private String user_name;
	private String email;
	private String password;
	private String phone;
	private Timestamp created_at;
	private String mem_code;
	private int cart_id;
	private int user_point;
	private String user_address;
	
	public UsersDTO() {
	}

	public UsersDTO(int user_id, String user_name, String email, String password, String phone, Timestamp created_at,
			String mem_code, int cart_id, int user_point, String user_address) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.created_at = created_at;
		this.mem_code = mem_code;
		this.cart_id = cart_id;
		this.user_point = user_point;
		this.user_address = user_address;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public String getMem_code() {
		return mem_code;
	}

	public void setMem_code(String mem_code) {
		this.mem_code = mem_code;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	
	
	
	
}
