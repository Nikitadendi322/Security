package com.example.security.mapper;

import com.example.security.Dto.AppUserDto;
import com.example.security.entity.AppUser;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {
    public AppUserDto toDto(AppUser user) {
        AppUserDto userDto = new AppUserDto();
        userDto.setId(user.getId());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());
        return userDto;
    }
}
