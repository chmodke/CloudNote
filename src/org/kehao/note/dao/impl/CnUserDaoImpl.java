package org.kehao.note.dao.impl;

import org.kehao.note.dao.CnUserDao;
import org.kehao.note.model.CnUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CnUserDaoImpl implements CnUserDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public CnUser getUserById(String id) {
		return (CnUser) ht.get(CnUser.class, id);
	}

}
