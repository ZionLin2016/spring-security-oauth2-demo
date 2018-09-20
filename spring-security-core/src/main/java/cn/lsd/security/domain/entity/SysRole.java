package cn.lsd.security.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: LSD
 * @Date: 2018/9/20
 */
@Entity
@Data
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
