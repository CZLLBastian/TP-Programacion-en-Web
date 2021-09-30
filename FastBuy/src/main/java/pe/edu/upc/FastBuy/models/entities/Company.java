package pe.edu.upc.FastBuy.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="company_id", columnDefinition = "NUMERIC(3)" )
	private Integer id;
	@Column(name="company_ruc", columnDefinition = "NUMERIC(11)" )
	private Integer numberRuc;
	@ManyToOne
	@JoinColumn(name="shop_id", nullable=false)
	private Shop shop;
	@ManyToOne
	@JoinColumn(name="sale_id", nullable=false)
	private Sale sale;
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<Product> products;
}
