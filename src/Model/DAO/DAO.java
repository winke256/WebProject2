package Model.DAO;

public interface DAO<T> {

	T save(T t) throws Exception;
	
	T update(T t) throws Exception;
	
	T remove(T t) throws Exception;
	
}
