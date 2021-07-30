package com.javazcl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javazcl.beans.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 11:30 上午
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
