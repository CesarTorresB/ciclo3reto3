package G37.CesarTorres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 *
 * @author cesartbossa
 */

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"CabinModelo.CabinInterface.CabinRepositorio.CabinServicios.CabinWeb"})
public class CesarTorresApplication {

	public static void main(String[] args) {
		SpringApplication.run(CesarTorresApplication.class, args);
	}

}
