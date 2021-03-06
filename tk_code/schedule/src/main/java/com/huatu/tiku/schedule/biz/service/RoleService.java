package com.huatu.tiku.schedule.biz.service;

import java.util.Set;

import com.huatu.tiku.schedule.base.service.BaseService;
import com.huatu.tiku.schedule.biz.domain.Role;

/**
 * 角色Service
 * 
 * @author Geek-S
 *
 */
public interface RoleService extends BaseService<Role, Long> {

	/**
	 * 根据教师ID获取角色
	 * 
	 * @param teacherId
	 *            教师ID
	 * @return 角色列表
	 */
	Set<Role> findByTeachersId(Long teacherId);
}
