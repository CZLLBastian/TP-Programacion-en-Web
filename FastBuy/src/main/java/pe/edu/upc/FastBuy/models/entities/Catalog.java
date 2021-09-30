package pe.edu.upc.FastBuy.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name =  "Catalog")
public class Catalog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="catalog_id", columnDefinition = "NUMERIC(3)")
	private Integer id;
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
}
