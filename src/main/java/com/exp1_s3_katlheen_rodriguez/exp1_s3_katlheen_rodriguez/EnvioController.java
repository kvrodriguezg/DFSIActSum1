package com.exp1_s3_katlheen_rodriguez.exp1_s3_katlheen_rodriguez;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvioController {

    // Lista de Envios
    private List<Envio> envios = new ArrayList<>();

    public EnvioController() {
        // Creación de objetos Envio
        envios.add(new Envio(1L, "Madrid, España", "Buenos Aires, Argentina", LocalDate.of(2025, 4, 5), "En tránsito",
                "Aeropuerto Madrid", LocalDate.of(2025, 4, 15)));
        envios.add(new Envio(2L, "New York, USA", "Lima, Perú", LocalDate.of(2025, 3, 10), "En tránsito",
                "Puerto de Nueva York", LocalDate.of(2025, 3, 20)));
        envios.add(new Envio(3L, "Los Angeles, USA", "Santiago, Chile", LocalDate.of(2025, 3, 5), "Entregado",
                "Centro de Distribución LA", LocalDate.of(2025, 3, 10)));
        envios.add(new Envio(4L, "Tokio, Japón", "São Paulo, Brasil", LocalDate.of(2025, 4, 12), "En tránsito",
                "Aeropuerto Internacional de Tokio", LocalDate.of(2025, 4, 22)));
        envios.add(new Envio(5L, "París, Francia", "Ciudad de México, México", LocalDate.now(), "En tránsito",
                "Puerto de Le Havre", LocalDate.of(2025, 5, 5)));
        envios.add(new Envio(6L, "Berlín, Alemania", "Buenos Aires, Argentina", LocalDate.now(), "En tránsito",
                "Puerto de Hamburgo", LocalDate.of(2025, 4, 1)));
        envios.add(new Envio(7L, "Londres, Reino Unido", "Bogotá, Colombia", LocalDate.now(), "En tránsito",
                "Aeropuerto Heathrow", LocalDate.of(2025, 3, 25)));
        envios.add(new Envio(8L, "Roma, Italia", "Lima, Perú", LocalDate.now(), "Entregado", "Puerto de Civitavecchia",
                LocalDate.of(2025, 3, 12)));
        envios.add(new Envio(9L, "Seúl, Corea del Sur", "Río de Janeiro, Brasil", LocalDate.now(), "En tránsito",
                "Aeropuerto de Incheon", LocalDate.of(2025, 4, 18)));
        envios.add(new Envio(10L, "Toronto, Canadá", "Santiago, Chile", LocalDate.now(), "Pendiente",
                "Puerto de Montreal", LocalDate.of(2025, 5, 10)));
    }

    // Endpoint que retorna la lista de todos los envios registrados
    @GetMapping("/envios")
    public List<Envio> getEnvios() {
        return envios;
    }

    // Endpoint que retorna un envio mediante el id consultado.
    @GetMapping("/envios/{id}")
    public Envio getEnvioById(@PathVariable Long id) {
        for (Envio envio : envios) {
            if (envio.getId() == id) {
                return envio;
            }
        }
        return null;
    }

}
