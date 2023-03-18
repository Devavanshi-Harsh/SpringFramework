package complexFormHandling.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import complexFormHandling.Entity.Visitor;

@Repository
public class VisitorDao {
	@Autowired
	private HibernateTemplate hiberTemp;

	public HibernateTemplate getHiberTemp() {
		return hiberTemp;
	}

	public void setHiberTemp(HibernateTemplate hiberTemp) {
		this.hiberTemp = hiberTemp;
	}
	@Transactional
	public int saveVisitor(Visitor v) {
		int id = (Integer) this.hiberTemp.save(v);
		return id;
	}

}
