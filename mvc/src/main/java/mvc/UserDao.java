package mvc;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hiberTemp;
	
	public HibernateTemplate getHiberTemp() {
		return hiberTemp;
	}

	public void setHiberTemp(HibernateTemplate hiberTemp) {
		this.hiberTemp = hiberTemp;
	}
	@Transactional
	public void saveUser(User s) {
		this.hiberTemp.save(s);
	}
}
