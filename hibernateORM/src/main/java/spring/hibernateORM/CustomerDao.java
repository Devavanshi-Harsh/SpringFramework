package spring.hibernateORM;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class CustomerDao {
		public HibernateTemplate hiberTemp;
		
		public HibernateTemplate getHiberTemp() {
			return hiberTemp;
		}

		public void setHiberTemp(HibernateTemplate hiberTemp) {
			this.hiberTemp = hiberTemp;
		}
		@Transactional
		public void insert(Customer customer) {
			hiberTemp.save(customer);
		}
		public Customer getObject(int a) {
			Customer c = this.hiberTemp.get(Customer.class, a);
			return c;
		}
		public List<Customer> getObjects() {
			List<Customer> c = this.hiberTemp.loadAll(Customer.class);
			return c;
		}
		@Transactional
		public void delete(int serialNumber) {
			Customer c  = this.getObject(serialNumber);
			this.hiberTemp.delete(c);
		}
		@Transactional
		public void update(Customer c) {
			this.hiberTemp.update(c);
		}
		
}
