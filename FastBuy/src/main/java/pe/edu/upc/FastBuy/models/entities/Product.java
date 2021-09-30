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
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id", columnDefinition = "NUMERIC(3)")
	private Integer id;
	@Column(name="product_name", length = 20)
	private String name;
	@Column(name="product_description", length = 40)
	private String description;
	@Column(name="product_price", columnDefinition = "DECIMAL(3,2)")
	private Float price;
	@ManyToOne
	@JoinColumn(name="company_id", nullable=false)
	private Company company;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<Voucher> vouchers;
	@OneToMany(mappedBy = "product", fetch =FetchType.LAZY)
	private List<SaleDetail> saledetails;
}
