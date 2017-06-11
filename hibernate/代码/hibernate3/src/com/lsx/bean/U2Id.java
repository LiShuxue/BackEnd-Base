package com.lsx.bean;

/**
 *  联合主键，会单独将主键 生成一个实体类
 */

public class U2Id implements java.io.Serializable {

	// Fields

	private String firstname;
	private String lastname;

	// Constructors

	/** default constructor */
	public U2Id() {
	}

	/** full constructor */
	public U2Id(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	// Property accessors

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof U2Id))
			return false;
		U2Id castOther = (U2Id) other;

		return ((this.getFirstname() == castOther.getFirstname()) || (this
				.getFirstname() != null && castOther.getFirstname() != null && this
				.getFirstname().equals(castOther.getFirstname())))
				&& ((this.getLastname() == castOther.getLastname()) || (this
						.getLastname() != null
						&& castOther.getLastname() != null && this
						.getLastname().equals(castOther.getLastname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFirstname() == null ? 0 : this.getFirstname().hashCode());
		result = 37 * result
				+ (getLastname() == null ? 0 : this.getLastname().hashCode());
		return result;
	}

}