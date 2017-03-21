package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Enum.Database;
import Model.Cliente;

public class ClienteDAOImpl extends DAOImpl<Cliente> implements ClienteDAO {

	public ClienteDAOImpl(){
		super(Database.USJT);
	}

	@Override
	public Cliente getClienteByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente t) throws Exception {
		try(PreparedStatement st = this.getConnection().prepareStatement("INSERT INTO tblCliente (Nome, Email) VALUES(?, ?)")){
			st.setString(1, t.getNome());
			st.setString(2, t.getEmail());
			st.executeUpdate();
			try(ResultSet rs = st.getGeneratedKeys()){
				while(rs.next()){
					t.setID(rs.getInt(1) > 0 ? rs.getInt(1) : 0);
					return t;
				}
			}
		}
		throw new Exception("Erro ao inserir cliente");
	}

	@Override
	public Cliente update(Cliente t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente remove(Cliente t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente parseToDTO(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
