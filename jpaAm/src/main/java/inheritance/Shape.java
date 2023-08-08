package inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name = "inheritance.Shape")
@DiscriminatorColumn(name="Shape_type", 
discriminatorType = DiscriminatorType.INTEGER)
@Table(name="im3_shape_2")
public class Shape {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="id")
	private int shape_id;
	@Column
	private int x_cor;
	@Column
	private int y_cor;

	public int getShape_id() {
		return shape_id;
	}

	public void setShape_id(int id) {
		this.shape_id = id;
	}

	public int getX_cor() {
		return x_cor;
	}

	public void setX_cor(int x_cor) {
		this.x_cor = x_cor;
	}

	public int getY_cor() {
		return y_cor;
	}

	public void setY_cor(int y_cor) {
		this.y_cor = y_cor;
	}

}
