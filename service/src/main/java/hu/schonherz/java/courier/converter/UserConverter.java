package hu.schonherz.java.courier.converter;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import hu.schonherz.java.courier.entities.User;
import hu.schonherz.java.courier.service.vo.UserVO;

public class UserConverter {

	static Mapper mapper = new DozerBeanMapper();

	public static UserVO toVo(User user) {
		if (user == null) {
			return null;
		}
		return mapper.map(user, UserVO.class);
	}

	public static User toEntity(UserVO userVO) {
		if (userVO == null) {
			return null;
		}
		return mapper.map(userVO, User.class);
	}

	public static List<UserVO> toVo(List<User> user) {
		List<UserVO> rv = new ArrayList<>();
		for (User users : user) {
			rv.add(toVo(users));
		}
		return rv;
	}

	public static List<User> toEntity(List<UserVO> user) {
		List<User> rv = new ArrayList<>();
		for (UserVO users : user) {
			rv.add(toEntity(users));
		}
		return rv;
	}
}
