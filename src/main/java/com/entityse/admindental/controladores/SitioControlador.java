package com.entityse.admindental.controladores;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entityse.admindental.daos.UsuarioDAO;


/**
 * 
 * @author Luis Humberto Chavez
 * Este el es controlador general del sitio
 *
 */

@Controller
public class SitioControlador 
{
	//Inyecciones de dependencias
	@Autowired   //Inyecta la dependencia antes registrada con Component
	//@Qualifier("usuarioDAO") //con Qualifier se inyexta la interfas, pero hay que indicar el nombre de
	                            //componente registrado con Component y es necesairo usar Autowired
	private UsuarioDAO usuarioDAO;
	
	
	
	// Se define un ruta para este sitio, esta es la ruta principal del login
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String vistaLogin(Model modelo)
	{
		modelo.addAttribute("titulo","Inicio");
		return "/sitio/login";//vista a mostrar
	}
	
	
	@RequestMapping(value="/menu", method={ RequestMethod.POST})
	public String inicioDeSesion(Model modelo,String usuario ,@RequestParam("pass") String pass)
	{
		modelo.addAttribute("usuario",usuario);
		modelo.addAttribute("pass",pass);		
		if(usuarioDAO.existeUsuario(usuario, pass))
		{
			return "sitio/menu";
		}
		else
		{
		 return "sitio/login";//vista a mostrar
		}
	}
	
   
}
