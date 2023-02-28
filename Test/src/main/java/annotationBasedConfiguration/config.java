package annotationBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "annotationBasedConfiguration")
public class config {
	@Bean(name = "Paani")
	public Water getWater() {
		Water w = new Water(12, "Bisleri");
		return w;
	}
	@Bean(name = "Mithai")
	public Sweets getSweets() {
		return new Sweets(20, "bikanerwala", getWater());
	}
}
