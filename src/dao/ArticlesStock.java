package dao;
// Generated Jun 22, 2021 12:30:17 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ArticlesStock generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "articles_stock", catalog = "g_stock")
public class ArticlesStock implements java.io.Serializable {

	private Integer codeArt;
	private int qteArt;
	private String nomArt;
	private String descArt;
	private int prixArt;

	public ArticlesStock() {
	}

	public ArticlesStock(int qteArt, String nomArt, String descArt, int prixArt) {
		this.qteArt = qteArt;
		this.nomArt = nomArt;
		this.descArt = descArt;
		this.prixArt = prixArt;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "codeArt", unique = true, nullable = false)
	public Integer getCodeArt() {
		return this.codeArt;
	}

	public void setCodeArt(Integer codeArt) {
		this.codeArt = codeArt;
	}

	@Column(name = "qteArt", nullable = false)
	public int getQteArt() {
		return this.qteArt;
	}

	public void setQteArt(int qteArt) {
		this.qteArt = qteArt;
	}

	@Column(name = "nomArt", nullable = false, length = 20)
	public String getNomArt() {
		return this.nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}

	@Column(name = "descArt", nullable = false, length = 200)
	public String getDescArt() {
		return this.descArt;
	}

	public void setDescArt(String descArt) {
		this.descArt = descArt;
	}

	@Column(name = "prixArt", nullable = false)
	public int getPrixArt() {
		return this.prixArt;
	}

	public void setPrixArt(int prixArt) {
		this.prixArt = prixArt;
	}

}
