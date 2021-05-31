package vo;

import java.sql.Timestamp;

public class UserVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String email;
	private int level;
	private Timestamp regdate;
	
	
	
	public UserVO() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
//	@Override
//	public String toString() {
//		return "UserVO [id=" + id + ", name=" + name + ", password=" + password + ", tel=" + tel + ", email=" + email
//				+ ", level=" + level + ", regdate=" + regdate + "]";
//	}
	
	

}
