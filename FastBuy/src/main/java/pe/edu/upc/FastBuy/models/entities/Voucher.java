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
@Table(name="Voucher")
public class Voucher {
	@Id
	@ManyToOne
	@JoinColumn(name="sale_id", nullable=false)
	private Sale sale;
	@ManyToOne
	@JoinColumn(name="payment_id", nullable=false)
	private Payment payment;
	@ManyToOne
	@JoinColumn(name = "client_id", nullable  = false)
	private Client client;
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shop_id", columnDefinition = "NUMERIC(15)")
	private Integer voucherNumber;
	
	
}
