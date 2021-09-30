package pe.edu.upc.FastBuy.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Sale_Detail")
public class SaleDetail {
	@Id
	@ManyToOne
	@JoinColumn(name="sale_id", nullable=false)
	private Sale sale;
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;
	@ManyToOne
	@JoinColumn(name="client_id", nullable=false)
	private Client client;
	@ManyToOne
	@JoinColumn(name="payment_id", nullable=false)
	private Payment payment;
	@ManyToOne
	@JoinColumn(name="brand_id", nullable=false)
	private Brand brand;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_amount", columnDefinition = "NUMERIC(12)")
	private Integer productAmount;
	@Column(name="product_amount", columnDefinition = "DECIMAL(3,2)")
	private Float saleAmount;
}
