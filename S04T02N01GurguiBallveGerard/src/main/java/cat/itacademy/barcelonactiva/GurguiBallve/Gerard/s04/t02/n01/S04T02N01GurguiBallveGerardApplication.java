package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01;

import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.model.Fruta;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.repository.FrutaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S04T02N01GurguiBallveGerardApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(S04T02N01GurguiBallveGerardApplication.class, args);
		FrutaRepository frutaRepository = context.getBean(FrutaRepository.class);

		Fruta fruta1 = new Fruta(null,"Manzana",10);
		Fruta fruta2 = new Fruta(null,"Platano",8);
		Fruta fruta3 = new Fruta(null,"Kiwi",14);

		frutaRepository.save(fruta1);
		frutaRepository.save(fruta2);
		frutaRepository.save(fruta3);


	}

}
