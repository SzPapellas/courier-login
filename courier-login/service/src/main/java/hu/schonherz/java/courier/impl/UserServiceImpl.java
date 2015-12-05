package hu.schonherz.java.courier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import hu.schonherz.java.courier.converter.UserConverter;
import hu.schonherz.java.courier.entities.User;
import hu.schonherz.java.courier.service.UserService;
import hu.schonherz.java.courier.service.vo.UserVO;
import hu.schonherz.java.training.courier.dao.RoleDao;
import hu.schonherz.java.training.courier.dao.UserDao;

@Service("userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Autowired
	RoleDao roleDao;

	@Override
	public UserVO findUserByName(String name) throws Exception {
		User user = userDao.findByUsername(name);
		return UserConverter.toVo(user);
	}

	@Override
	public void registrationUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserVO> getUserList(int i, int pageSize, String sortField, int dir, String filter,
			String filterColumnName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getUserCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(UserVO selectedUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub
		
	}
}