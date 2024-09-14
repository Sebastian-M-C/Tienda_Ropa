/*
package old_money.tiendaropa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig {

    */
/*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                // Permitir acceso a las rutas públicas incluyendo "/"
                                .requestMatchers("/", "/index", "/info", "/css/**", "/js/**").permitAll()
                                // Rutas que requieren autenticación
                                .requestMatchers("/profile/**", "/admin/**").authenticated()
                                // Cualquier otra ruta requerirá autenticación
                                .anyRequest().authenticated()
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login") // Página de login personalizada
                                .permitAll()         // Permite acceso a todos en la página de login
                                .defaultSuccessUrl("/profile", true) // Redirige después de un login exitoso
                )
                .logout(logout ->
                        logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // URL para logout
                                .logoutSuccessUrl("/home") // Redirige después de cerrar sesión
                                .permitAll()
                )
                .httpBasic(Customizer.withDefaults()); // Para login básico si es necesario

        return http.build();
    }*//*

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .anyRequest().permitAll() // Permitir todas las rutas temporalmente
                )
                .csrf(csrf -> csrf.disable()); // Deshabilitar CSRF correctamente para versiones recientes

        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("root")
                .password("12345")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }


}

*/
