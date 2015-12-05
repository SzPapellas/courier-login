package hu.schonherz.java.courier.service;

import java.util.List;

import hu.schonherz.java.courier.service.vo.UserVO;

public interface UserService {

	public UserVO findUserByName(String name) throws Exception;

	public void registrationUser(UserVO userVO) throws Exception;

	public List<UserVO> getUserList(int i, int pageSize, String sortField, int dir, String filter,
			String filterColumnName);

	public List<UserVO> getUsers();

	public Integer getUserCount();

	public void saveUser(UserVO selectedUser);

	public UserVO findById(Long id);

	public void removeById(Long id);

	
}