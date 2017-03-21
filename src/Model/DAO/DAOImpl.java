package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import Enum.Database;
import Enum.DatabaseExtension;

public abstract class DAOImpl<T> implements DAO<T>  {
	
	private final String CONNECTION_IP 	= "127.0.0.1";
	private final String USER 			= "root";
	private final String PASS 			= "123456";
	private final String PORT 			= "8080";
	
	private String database;
	
	public DAOImpl(Database database){
		this.database = DatabaseExtension.getDatabaseName(database);
	}
	
	public abstract T save(T t) throws Exception;
	
	public abstract T update(T t) throws Exception;
	
	public abstract T remove(T t) throws Exception;
	
	public abstract T parseToDTO(ResultSet resultSet);
	
	public Connection getConnection() throws Exception{
		try{
			return DriverManager.getConnection("jdbc:mysql://"+CONNECTION_IP+":"+PORT+"/"+this.database, USER, PASS);
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		throw new Exception("Erro ao obter conex�o");
	}
	
}
