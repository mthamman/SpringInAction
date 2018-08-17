package soundsystem_autowiring;

import org.springframework.context.annotation.ComponentScan;

//@ComponentScan
//@ComponentScan(basePackages= "soundsystem_autowiring")
//@ComponentScan(basePackages= {"soundsystem_autowiring", ""})
@ComponentScan(basePackageClasses= {CDPlayerConfig.class})
public class CDPlayerConfig {

}