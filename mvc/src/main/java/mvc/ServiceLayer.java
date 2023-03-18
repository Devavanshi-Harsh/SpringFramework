package mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int createUser(User s) {
		System.out.println("Service Layer trying to insert the Data");
		return this.userDao.saveUser(s);
	}

}
