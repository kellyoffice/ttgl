/**
 * Date:2015年7月17日下午11:06:59
 * Mail:zhaoqi19880624@163.com
 * Copyright (c) 2015 by ZhaoQi , All Rights Reserved .
 *
*/

package com.kellyqi.ttgl.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kellyqi.ttgl.dao.FamilyMapper;
import com.kellyqi.ttgl.model.Family;
import com.kellyqi.ttgl.service.FamilyService;

/**
 * Function: TODO ADD FUNCTION. <br/>
 * Date:     2015年7月17日 下午11:06:59 <br/>
 * @author   ZhaoQi
 * @version  enclosing_typetags
 * @since    JDK 1.7
 * @see 	 
 */
@Service
public class FamilyServiceImp implements FamilyService {
	@Autowired
	private FamilyMapper familyMapper;
	@Override
	public int saveFamily(Family family) {
		return familyMapper.insertSelective(family);
	}

}

