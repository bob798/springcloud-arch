package me.libob.accountservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.libob.accountservice.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
