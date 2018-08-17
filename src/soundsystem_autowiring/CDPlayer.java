package soundsystem_autowiring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// import javax.inject.Named
// import javax.inject.Inject

@Component // or @Named
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	// or @Inject
	@Autowired(required=false) // required=false indicates if spring doesnt find a matching bean for autowiring it will leave unwired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

//	@Autowired // or @Inject
//	public void insertDisc(CompactDisc cd) {
//		this.cd = cd;
//	}

	public void play() {
		cd.play();
	}
}