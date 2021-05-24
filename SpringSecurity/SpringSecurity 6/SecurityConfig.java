package com.springsecurity.springsecurity6;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("user").password("$2a$10$T2rN853Tv/T4a97QoPBILu7kxniem2NzfmLs8cygmWqFrcpWZwYAu").roles("USER")
                .and().withUser("admin").password("4567").roles("ADMIN");
    }
   /* @Bean
    public PasswordEncoder getPasswordEncoder(){

        return NoOpPasswordEncoder.getInstance();
    }*/
   @Bean
   public PasswordEncoder getEncoder() {

       return new BCryptPasswordEncoder();
   }

    @Override
    protected void configure(HttpSecurity http)throws Exception
    {
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/user").hasAnyRole("ADMIN,USER")
                .antMatchers("/").permitAll()
                .and()
                .formLogin()
                .and()
                .rememberMe();
            

    }

}
