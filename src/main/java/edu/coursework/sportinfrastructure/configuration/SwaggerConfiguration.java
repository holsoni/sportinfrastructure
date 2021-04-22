/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.configuration.SwaggerConfiguration
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 19.04.21, 19:59
 *  * @Version SwaggerConfiguration.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    //@Bean
    public OpenAPI stadiumOpenApi(){

            return new OpenAPI().
                    info(
                        new Info()
                            .title("Курсовий проект")
                            .version("1.0")
                            .contact(new Contact()
                            .email("kostashchuk.sofiia@chnu.edu.ua")
                            .name("Sonia")
                            .url("my-site.cv.ua"))

            );
    }
}
