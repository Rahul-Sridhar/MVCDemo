package model;

public class LoginDetails 
{
	String uname, passwd;
	public boolean isValidLogin()
	{
		if(uname.equals("Rahul") && passwd.equals("12345"))
			return true;
		else 
			return false;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
