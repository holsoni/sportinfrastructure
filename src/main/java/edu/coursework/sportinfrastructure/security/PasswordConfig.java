package edu.coursework.sportinfrastructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * CourseWork.PasswordConfig
 *
 * @author Nazar Palijchuk
 * @version PasswordConfig: 1.0
 * @since 08.05.2021|22:49
 */

@Configuration
public class PasswordConfig
{
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder(10);
	}
}