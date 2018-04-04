package annotationPackage;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class BadFortuneService implements FortuneService {

	private String fortune;

	public BadFortuneService(String fortune) {

		this.fortune = fortune;
	}

	@Override
	public String getFortune() {

		return fortune;
	}

}
