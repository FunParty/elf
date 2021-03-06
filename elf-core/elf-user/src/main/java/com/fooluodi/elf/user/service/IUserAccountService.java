package com.fooluodi.elf.user.service;

import com.fooluodi.elf.common.exception.ElfServiceException;
import com.fooluodi.elf.user.dto.ElfUserInnerDto;
import com.fooluodi.elf.user.dto.ElfUserUpdateDto;
import com.fooluodi.elf.user.exception.ElfUserServiceException;

/**
 * Created by di on 15/11/15.
 * 用户账户service
 */
public interface IUserAccountService {
    /**
     * 用来查看一个手机号是否已经注册为我们用户
     *
     * @param phoneNum
     *
     * @return boolean
     * */
    public boolean isPhoneNew(String phoneNum);

    /**
     * 根据手机号注册新的用户
     * @param phoneNum
     * */
    public void createUserByPhone(String phoneNum) throws ElfServiceException;

    /**
     * 通过一个手机号得到用户账户信息
     * @param phoneNum
     * 如果传入手机号不存在, 抛出serviceException
     *
     * @return ElfUserInnerDto
     * */
    public ElfUserInnerDto getUesrByPhone(String phoneNum) throws ElfServiceException;

    /**
     * 根据userId获取user
     *
     * @param userId
     * */
    public ElfUserInnerDto getUserByUserId(int userId) throws ElfServiceException;

    /**
     * 更新个人资料的服务
     *
     * @param userDto
     *
     * @return 修改后的ElfUserDto
     * */
    public ElfUserUpdateDto updateUserProfile(ElfUserUpdateDto userDto) throws ElfUserServiceException;
}
