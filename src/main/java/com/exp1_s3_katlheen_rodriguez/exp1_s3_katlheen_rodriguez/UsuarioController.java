package com.exp1_s3_katlheen_rodriguez.exp1_s3_katlheen_rodriguez;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

        // Lista de Usuarios
        private List<Usuario> usuarios = new ArrayList<>();

        public UsuarioController() {

                // Se agregan usuarios a la lista con sus atributos. Los ids contienen L ya que
                // son de tipo Long. Los conductores no tienen mascotas asignadas.
                usuarios.add(new Usuario(1L, "Juan Pérez", "juan@gmail.com", "12345678-9", "Dueño de mascota",
                                "123456789", "Sagrada Familia 1343",
                                Map.of(
                                                1, Map.of("nombre", "Max", "tipo", "Perro", "raza", "Labrador"),
                                                2, Map.of("nombre", "Luna", "tipo", "Gato", "raza", "Siamés"))));
                usuarios.add(new Usuario(2L, "Ana López", "ana@gmail.com", "98765432-1",
                                "Conductor", "987654321", "Avenida Siempre Viva 742",
                                null)); // Conductor sin mascotas
                usuarios.add(new Usuario(3L, "Carlos Ruiz", "carlos@gmail.com", "45612345-6", "Dueño de mascota",
                                "456123789", "Calle Luna 456",
                                Map.of(1, Map.of("nombre", "Rocky", "tipo", "Perro", "raza", "Bulldog"))));
                usuarios.add(new Usuario(4L, "Laura Gómez", "laura@gmail.com", "87654321-0",
                                "Conductor", "321654987", "Calle Sol 789",
                                null)); 
                usuarios.add(new Usuario(5L, "Pedro Sánchez", "pedro@gmail.com", "23456789-0", "Dueño de mascota",
                                "654321987", "Avenida Libertador 321",
                                Map.of(1, Map.of("nombre", "Rocky", "tipo", "Perro", "raza", "Chihuahua"))));
                usuarios.add(new Usuario(6L, "Marta Torres", "marta@gmail.com", "34567890-1", "Dueño de mascota",
                                "876543210", "Calle Verde 234",
                                Map.of(1, Map.of("nombre", "Bobby", "tipo", "Perro", "raza", "Pastor Alemán"))));
                usuarios.add(new Usuario(7L, "Luis Martín", "luis@gmail.com", "45678901-2",
                                "Conductor", "987654321", "Calle Luna 567",
                                null)); 
                usuarios.add(new Usuario(8L, "Raquel Díaz", "raquel@gmail.com", "56789012-3", "Dueño de mascota",
                                "123987654", "Calle Océano 891",
                                Map.of(1, Map.of("nombre", "Daisy", "tipo", "Perro", "raza", "Beagle"))));
                usuarios.add(new Usuario(9L, "Antonio López", "antonio@gmail.com", "67890123-4", "Dueño de mascota",
                                "234567890", "Calle Fuego 101",
                                Map.of(1, Map.of("nombre", "Milo", "tipo", "Perro", "raza", "Bulldog Francés"))));
                usuarios.add(new Usuario(10L, "Clara Gómez", "clara@gmail.com", "78901234-5",
                                "Conductor", "345678901", "Calle Estrella 202",
                                null));
        } 

        // Endpoint que retorna la lista de todos los usuarios registrados
        @GetMapping("/usuarios")
        public List<Usuario> getUsuarios() {
                return usuarios;
        }

        // Endpoint que retorna un usuario mediante el id consultado. En caso de no existir retorna null.
        @GetMapping("/usuarios/{id}")
        public Usuario getUsuarioById(@PathVariable Long id) {
                for (Usuario usuario : usuarios) {
                        if (usuario.getId() == id) {
                                return usuario;
                        }
                }
                return null;
        }
}
