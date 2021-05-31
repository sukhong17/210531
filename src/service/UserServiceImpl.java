package service;

import dao.UserDAO;
import vo.UserVO;

public class UserServiceImpl implements UserService {
	
	private UserDAO dao = null;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public UserServiceImpl(UserDAO dao) {
		this.dao = dao;
	}
	
	
	@Override
	public void register(UserVO vo) {
		// TODO Auto-generated method stub
		
		dao.register(vo);
		
	}
	
	
	@Override
	public UserVO login(String id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}
	
	
}
