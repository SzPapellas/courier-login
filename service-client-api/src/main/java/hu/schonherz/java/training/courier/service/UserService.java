package hu.schonherz.java.training.courier.service;

import java.util.List;

import hu.schonherz.java.training.courier.service.vo.UserVO;

public interface UserService {

	public UserVO findUserByName(String name) throws Exception;

}