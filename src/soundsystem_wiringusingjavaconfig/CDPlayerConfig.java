package soundsystem_wiringusingjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

	// Note. By default, all beans in Spring are singleton
	// Declaring a bean
	@Bean // or @Bean(name="anyname") , by default it will take method name as bean name
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	// Injecting a bean into another (approach 1 using contructor)
	@Bean // or @Bean(name="anyname")
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

	// Injecting a bean into another(approach 2 using contructor again)
//	@Bean // or @Bean(name="anyname")
//	public CDPlayer cdPlayer(CompactDisc compactDisc) {
//		return new CDPlayer(compactDisc);
//	}

	// Injecting a bean into another(approach 3 using setter method)
//	@Bean // or @Bean(name="anyname")
//	public CDPlayer cdPlayer(CompactDisc compactDisc) {
//		CDPlayer cdPlayer = new CDPlayer(compactDisc);
//		cdPlayer.setCompactDisc(compactDisc);
//		return cdPlayer;
//	}

}