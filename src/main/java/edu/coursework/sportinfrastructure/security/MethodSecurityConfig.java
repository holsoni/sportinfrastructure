package edu.coursework.sportinfrastructure.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 * Created by IntelliJ IDEA.
 * CourseWork.MethodSecurityConfig
 *
 * @author Nazar Palijchuk
 * @version MethodSecurityConfig: 1.0
 * @since 13.05.2021|22:11
 */

@Configuration
@EnableGlobalMethodSecurity(
		prePostEnabled = true,
		securedEnabled = true,
		jsr250Enabled = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration
{

}