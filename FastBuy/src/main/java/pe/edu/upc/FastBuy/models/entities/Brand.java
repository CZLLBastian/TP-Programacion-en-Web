package pe.edu.upc.FastBuy.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Brands")
public class Brand {
	@Id
	@Column(name="brand_id", length=2)
	private Integer id;
	@Column(name="brand_name", length=40)
	private String name;
	@OneToMany(mappedBy = "brand", fetch =FetchType.LAZY)
	private List<SaleDetail> saledetails;
		
}
