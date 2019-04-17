package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.pojo.Hr;
import org.sang.pojo.MsgContent;
import org.sang.pojo.SysMsg;

import java.util.List;


@Mapper
public interface SysMsgMapper {

    int sendMsg(MsgContent msg);

    int addMsg2AllHr(@Param("hrs") List<Hr> hrs, @Param("mid") Long mid);

    List<SysMsg> getSysMsg(@Param("start") int start, @Param("size") Integer size, @Param("hrid") Long hrid);

    int markRead(@Param("flag") Long flag, @Param("hrid") Long hrid);
}
