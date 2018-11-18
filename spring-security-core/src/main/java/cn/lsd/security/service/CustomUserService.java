package cn.lsd.security.service;

import cn.lsd.security.dao.SysUserRepository;
import cn.lsd.security.domain.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Author: LSD
 * @Date: 2018/9/20
 */
@Component
public class CustomUserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    SysUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = userRepository.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        System.out.println("username:" + user.getUsername() + ";password:" + user.getPassword());
        System.out.println("加密后的密码为: " + passwordEncoder.encode(user.getPassword()));
        return user;
    }
}