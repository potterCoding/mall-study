package com.mall.demo.dao;

import com.mall.demo.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/23 10:30
 * @description 后台用户与角色管理自定义Dao
 */
@Repository
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
