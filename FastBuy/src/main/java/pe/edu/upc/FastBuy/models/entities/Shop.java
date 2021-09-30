package pe.edu.upc.FastBuy.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Shop")
public class Shop {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shop_id", columnDefinition = "NUMERIC(3)")
	private Integer id;
	@Column(name="deparment", length = 10)
	private String deparmentShop;
	@Column(name="town", length = 10)
	private String townShop;
	@Column(name="distric", length = 10)
	private String districtShop;
	
	@OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
	private List<Company> companies;
}
