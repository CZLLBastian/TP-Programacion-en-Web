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
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="payment_id", columnDefinition = "NUMERIC(3)")
	private Integer id;
	@OneToMany(mappedBy = "payment", fetch = FetchType.LAZY)
	private List<Voucher> vouchers;
	@OneToMany(mappedBy = "payment", fetch =FetchType.LAZY)
	private List<SaleDetail> saledetails;
}
