package pe.edu.upc.FastBuy.models.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.edu.upc.FastBuy.models.entities.Product;

public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext(unitName = "FastBuyDS")
	private EntityManager entityManager;
	
	@Override
	public Product save(Product entity) throws Exception {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public Product update(Product entity) throws Exception {
		entityManager.merge(entity);
		return entity;
	}

	@Override
	public Optional<Product> findById(Integer id) throws Exception {
		Optional<Product> optional = Optional.empty();
		Product product = entityManager.find(Product.class, id);
		if(product != null ) {
		optional = Optional.of(product);
		}
		return optional;
	}

	
	@Override
	public List<Product> findAll() throws Exception {
		List<Product> products = new ArrayList<Product>();
		//create a sentence
		String jpql="SELECT product FROM Product product";
		TypedQuery<Product> typedQuery = entityManager.createQuery(jpql, Product.class);
		products= typedQuery.getResultList();
				
		return products;
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		//exist or not
		Optional<Product> optional = findById(id);
		//if exist
		if(optional.isPresent()) {
			//remove  the object
			entityManager.remove(optional.get());
		}
		
	}

}
