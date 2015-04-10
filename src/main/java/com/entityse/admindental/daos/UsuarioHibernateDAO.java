package com.entityse.admindental.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entityse.admindental.entidades.Usuario;

@Component("usuarioDAO")// Inyeccion de dependencias, se utiliza ya que no ha sido declarada en el xml de DAOS-context
                        // Componente registra el componente en el contexto de spring, se registra como usuarioDAO     
public class UsuarioHibernateDAO implements UsuarioDAO
{
	

	@Override
	public void registrarUsuario(Usuario usuario) {
		System.out.println("\n-->Estoy registrando un usuario\n");
		
	}

	@Override
	public Usuario buscarUsuario(String usuario) {
		System.out.println("\n-->Estoy buscando un usuario\n");
		return null;
	}
	
	@Override
	public boolean existeUsuario(String usuario, String Pass)
	{
		System.out.println("\n-->Estoy verificando si existe el usuaurio\n");
	 return false;
	}

}
