package cn.lsd.security.dao;

import cn.lsd.security.domain.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: LSD
 * @Date: 2018/9/20
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
