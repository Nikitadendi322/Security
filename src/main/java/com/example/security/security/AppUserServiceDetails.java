package com.example.security.security;

import com.example.security.mapper.AppUserMapper;
import com.example.security.repository.AppUserRepository;
import org.apache.catalina.mapper.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AppUserServiceDetails implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(AppUserServiceDetails.class);

    private final AppUserRepository repository;
    private final AppUserDetails appUserDetails;
    private final AppUserMapper mapper;

    public AppUserServiceDetails(AppUserRepository repository, AppUserDetails appUserDetails, AppUserMapper mapper) {
        this.repository = repository;
        this.appUserDetails = appUserDetails;
        this.mapper = mapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var appUser = repository.findAppUserByLogin(username)
                .orElseThrow(() -> new IllegalStateException("user not found"));
        appUserDetails.setUserDetails(mapper.toDto(appUser));
        return appUserDetails;
    }


}
