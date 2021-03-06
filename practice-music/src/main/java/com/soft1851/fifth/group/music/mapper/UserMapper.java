package com.soft1851.fifth.group.music.mapper;


import com.soft1851.fifth.group.music.domain.dto.UserDto;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.domain.vo.UserVo;

import java.util.List;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-04-02
 **/
public interface UserMapper {

    /**
     * 通过用户 手机号或者邮箱 查找该用户的 salt 值
     * @param userDto
     * @return
     */
    String getSaltById(UserDto userDto);

    /**
     * 动态SQL查询
     *
     * @param user
     * @return List<User>
     */
    User selectByDynamicSql(User user);

    /**
     * 通过用户id查找用户基本信息以及收藏的音乐的基本信息
     *
     * @param user 用户
     * @return List<UserVo>
     */
    List<UserVo> selectUserInfo(User user);

    /**
     * 注册用户
     *
     * @param user
     */
    void insert(User user);

    /**
     * 通过id修改用过户基本信息，增加用户积分
     * */
    void update(User user);

    /**
     *查询用户
     * */
    User selectuser(User user);
}
