package model;

public class Customer {
	private String Fname;
	private String Lname;
	private String BA;
	private Long CC;
	private String user;
	private String pass;
	private String email;
	
	public Customer() {
		this.Fname = "Chris";
		this.Lname = "Maltusch";
		this.BA = "1000 lakeside dr. athens,ga 30605";
		this.CC = 1234123412341234L;
		this.user = "ChrissyPoo447";
		this.pass = "KodaIsMyDawg";
		this.email = "CMaltuschcops@yahoo.com";
	}
	public Customer(String Fname, String Lname, String BA, Long CC, String user, String pass, String email) {
		this.Fname = Fname;
		this.Lname = Lname;
		this.BA = BA;
		this.CC = CC;
		this.user = user;
		this.pass = pass;
		this.email = email;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return Fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		Fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return Lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		Lname = lname;
	}
	/**
	 * @return the bA
	 */
	public String getBA() {
		return BA;
	}
	/**
	 * @param bA the bA to set
	 */
	public void setBA(String bA) {
		BA = bA;
	}
	/**
	 * @return the cC
	 */
	public Long getCC() {
		return CC;
	}
	/**
	 * @param cC the cC to set
	 */
	public void setCC(Long cC) {
		CC = cC;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



}
