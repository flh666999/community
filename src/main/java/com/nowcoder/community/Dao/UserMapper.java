package com.nowcoder.community.Dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public User selectById(int id);//单独传一个参数时不存在参数绑定问题
    public User selcetByName(String username);
    public User selectByEmail(String email);

    public int insertUser(User user);
    public int updateStatus(@Param("id")int id,@Param("status") int status);//传两个参数时存在参数绑定问题
    public int updatePassword(@Param("id")int id,@Param("password") String password);
    public int updateHeader(@Param("id")int id,@Param("headerUrl") String headerUrl);
}
