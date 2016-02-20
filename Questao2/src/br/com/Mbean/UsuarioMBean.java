package br.com.Mbean;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.crypto.SecretKeyFactory;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;

import br.com.entidade.Usuario;

import com.mysql.jdbc.Connection;

@RequestScoped
@ManagedBean
public class UsuarioMBean {
	
	ArrayList<Usuario> usuario;

	public static Connection connection;
	public static ResultSet rs;
	
	
		public UsuarioMBean() {
		this.usuario = new ArrayList<Usuario>();
	}

		public ArrayList<Usuario> getUsuario() {
		return usuario;
	}
	

		public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}

}
