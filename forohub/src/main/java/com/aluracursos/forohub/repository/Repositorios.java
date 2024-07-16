package com.example.forohub.repository;

import com.example.forohub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {}

package com.example.forohub.repository;

        import com.example.forohub.model.Respuesta;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {}

package com.example.forohub.repository;

        import com.example.forohub.model.Usuario;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}

package com.example.forohub.repository;

        import com.example.forohub.model.Curso;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {}

package com.example.forohub.repository;

        import com.example.forohub.model.Perfil;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {}
