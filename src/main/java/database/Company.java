package database;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Company {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String nameCompany;
	
	@OneToMany ( cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "company")
	private List<Cartridge> listCartridges;
	
	
	
	// BEGIN //CONSTRUCTOR
	public Company(String nameCompany, List<Cartridge> listCartridges) {
		this.nameCompany = nameCompany;
		this.listCartridges = listCartridges;
	}
	// END //CONSTRUCTOR

	// BEGIN // GETTER & SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNameCompany() {
		return nameCompany;
	}


	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	
	

	public List<Cartridge> getListCartridges() {
		return listCartridges;
	}

	public void setListCartridges(List<Cartridge> listCartridges) {
		this.listCartridges = listCartridges;
	}
	// END // GETTER & SETTER

	

	
	// BEGIN // ToSTRING
	@Override
	public String toString() {
		return "Company [nameCompany=" + nameCompany + ", listCartridges=" + listCartridges + "]";
	}	
	// END // ToSTRING
	
	
	
	
	
	
	
	

}
