package complexFormHandling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import complexFormHandling.Dao.VisitorDao;
import complexFormHandling.Entity.Visitor;

@Service
public class ServiceLayer {
	@Autowired
	private VisitorDao visitorDao;

	public VisitorDao getVisitorDao() {
		return visitorDao;
	}

	public void setVisitorDao(VisitorDao visitorDao) {
		this.visitorDao = visitorDao;
	}
	public int callVisitorDao(Visitor v) {
		return this.visitorDao.saveVisitor(v);
	}

}
