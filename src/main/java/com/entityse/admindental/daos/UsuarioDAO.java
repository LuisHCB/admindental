package com.entityse.admindental.daos;

import com.entityse.admindental.entidades.Usuario;

/**
 * 
 * @author Luis Humberto Chavez
 *
 */
public interface UsuarioDAO {
	
	public abstract void registrarUsuario(Usuario usuario);
	
	Usuario buscarUsuario(String usuario);

	/**
	 * Verifica si el usuario existe, de ser asi devuelve true
	 * @param usuario Usuario a busca
	 * @param Pass  Contraseña del usuario
	 * @return
	 */
	boolean existeUsuario(String usuario, String Pass);

}
