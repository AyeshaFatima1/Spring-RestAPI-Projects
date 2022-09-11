package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestApi4ManyToMany1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApi4ManyToMany1Application.class, args);
		
		/*private static Product createUserObject1() {
		Users user = new Users();
		user.setUsername("user1");
		user.setPassword("testPassword");
		Role role = new Role();
		role.setName("Lab Staff");
		List<Role> roles = Collections.singletonList(role);
		user.setRoles(roles);
		return user;
		}
		private static Users createUserObject2() {
		Users user = new Users();
		user.setUsername("user2");
		user.setPassword("testPassword2");
		Role role1 = new Role();
		role1.setName("Teacher");
		Role role2 = new Role();
		role2.setName("Chairman");
		List<Role> roles = new ArrayList<>();
		roles.add(role1);
		roles.add(role2);
		user.setRoles(roles);
		return user;
		}*/
	}
}