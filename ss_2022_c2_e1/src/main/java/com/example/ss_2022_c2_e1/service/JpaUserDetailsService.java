package com.example.ss_2022_c2_e1.service;

import com.example.ss_2022_c2_e1.repository.UserRepo;
import com.example.ss_2022_c2_e1.security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        var u = userRepo.findUserByUsername(username);

        return u.map(SecurityUser::new)
                .orElseThrow(()-> new UsernameNotFoundException(
                        "username not found: "+ username));
    }
}
