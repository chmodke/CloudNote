package org.kehao.note.service.impl;

import org.kehao.note.dao.CnUserDao;
import org.kehao.note.model.CnUser;
import org.kehao.note.service.CnUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CnUserServiceImpl implements CnUserService {
	@Autowired
	private CnUserDao userDao;
	@Override
	public CnUser getUserById(String id) {
		return userDao.getUserById(id);
	}

}
