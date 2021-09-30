package pe.edu.upc.FastBuy.models.entities;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Sale")
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Sale_id", columnDefinition = "NUMERIC(3)")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "client_id", nullable  = false)
	private Client client;
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;
	@Column(name="product_price", columnDefinition = "DECIMAL(3,2)")
	private Float saleAmount;
	@Column(name = "sale_date")
	@Temporal(TemporalType.DATE)
	private Date saleDate;
	@OneToMany(mappedBy = "sale", fetch = FetchType.LAZY)
	private List<Company> companies;
	@OneToMany(mappedBy = "sale", fetch =FetchType.LAZY)
	private List<Voucher> vouchers;
	@OneToMany(mappedBy = "sale", fetch =FetchType.LAZY)
	private List<SaleDetail> saledetails;
}
