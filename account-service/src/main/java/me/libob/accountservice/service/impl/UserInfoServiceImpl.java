package me.libob.accountservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import me.libob.accountservice.domain.UserInfo;
import me.libob.accountservice.mapper.UserInfoMapper;
import me.libob.accountservice.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getById(Long id) {
        return super.getById(id);
    }

    @Override
    public boolean save(UserInfo entity) {
        return super.save(entity);
    }

    @Override
    public UserInfo findByUserName(String username) {
        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserInfo::getUserName, username);
        return userInfoMapper.selectOne(queryWrapper);
    }

    @Override
    public List<UserInfo> list() {
        return super.list();
    }

}
