package com.lorgio.labs.designpatterns.builder.user;

public class User {

	private final String username;
	private final int age;
	private final String email;
	private final boolean active;
	
	private User(UserBuilder userBuilder) {
		this.username = userBuilder.username;
		this.age = userBuilder.age;
		this.email = userBuilder.email;
		this.active = userBuilder.active;
	}
	
	public String getUsername() {
		return username;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public boolean isActive() {
		return active;
	}
	
	
	public static class UserBuilder {
		private String username;
		private int age;
		private String email;
		private boolean active;
		
		public UserBuilder buildUsername(String username) {
			this.username = username;
			return this;
		}
		
		public UserBuilder buildAge(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder buildEmail(String email) {
			this.email = email;
			return this;
		}
		
		public UserBuilder buildActive(boolean active) {
			this.active = active;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
