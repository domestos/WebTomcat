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
public class Cartridge {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String typeCartridge;
	
	@Column
	private String numberLink;
	
	@Column
	private String rqLink;	
	

	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Company company;

	// BEGIN //CONSTRUCTOR	
	public Cartridge(String typeCartridge, String numberLink, String rqLink, Company company) {	
		this.typeCartridge = typeCartridge;
		this.numberLink = numberLink;
		this.rqLink = rqLink;
		this.company = company;
	}	
	// END //CONSTRUCTOR
	
	// BEGIN // GETTER & SETTER
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTypeCartridge() {
		return typeCartridge;
	}


	public void setTypeCartridge(String typeCartridge) {
		this.typeCartridge = typeCartridge;
	}


	public String getNumberLink() {
		return numberLink;
	}


	public void setNumberLink(String numberLink) {
		this.numberLink = numberLink;
	}


	public String getRqLink() {
		return rqLink;
	}


	public void setRqLink(String rqLink) {
		this.rqLink = rqLink;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
	
	// END // GETTER & SETTER

	@Override
	public String toString() {
		return " \n Cartridge [typeCartridge=" + typeCartridge + ", numberLink=" + numberLink + ", rqLink=" + rqLink + "]";
	}


	// BEGIN // ToSTRING
	
	
	// END // ToSTRING


	
	
	
}
