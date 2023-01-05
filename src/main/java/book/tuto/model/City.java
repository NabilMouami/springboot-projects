package book.tuto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public Long getId() {
		return id;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

    public City(String name) {
        this.name = name;
    }
}
