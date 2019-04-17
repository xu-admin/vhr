package org.sang.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.sang.pojo.Menu;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
