package com.lorgio.labs.designpatterns.builder.user;

import org.junit.Test;
import static com.lorgio.labs.designpatterns.builder.user.User.UserBuilder;
import static junit.framework.Assert.assertNotNull;

public class UserTest {

	@Test
	public void buildUser() {
		User user = new UserBuilder()
	            .buildUsername("johndoe")
	            .buildAge(26)
	            .buildEmail("johndoe@example.com")
	            .build();
		assertNotNull("No se pudo construir el usuario", user);
	}
}
