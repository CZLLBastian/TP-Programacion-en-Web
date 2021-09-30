package pe.edu.upc.FastBuy.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="category_id", columnDefinition = "NUMERIC(3)")
	private Integer id;
	@Column(name ="category_name", length = 40)
	private String name;
}
