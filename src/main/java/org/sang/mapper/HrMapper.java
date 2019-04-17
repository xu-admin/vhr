package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.pojo.Hr;
import org.sang.pojo.Role;

import java.util.List;

@Mapper
public interface HrMapper {
    public Hr loadUserByUsername(String username);
    public List<Role> getRolesByHrId(Long id);
    List<Hr> getAllHr(@Param("currentId") Long currentId);
}
