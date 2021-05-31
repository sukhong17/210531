package service;

import vo.UserVO;

public interface UserService {
	
	public void register(UserVO vo);
	public UserVO login(String id, String password);
}
