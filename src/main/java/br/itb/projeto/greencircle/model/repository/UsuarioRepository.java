package br.itb.projeto.greencircle.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.greencircle.model.entity.Usuario;

								// ESTENDE A INTERFACE JpaRepository
@Repository						// <Tabela_que_ela_faz_referência, Tipo_de_dado_do_atributo_@Id_da_tabela_referedia>
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByEmail(String email);

}
