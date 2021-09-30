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
@Table(name="Client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_id", columnDefinition = "NUMERIC(3)" )
	private Integer id;
	@Column(name="client_dni", columnDefinition = "NUMERIC(8)" )
	private Integer dni;
	@Column(name="client_firstname", length = 10)
	private String firstName;
	@Column(name="client_lastname", length = 10)
	private String lastName;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Sale> sales;
		
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Voucher> vouchers;
	
	@OneToMany(mappedBy = "client", fetch =FetchType.LAZY)
	private List<SaleDetail> saledetails;
}
