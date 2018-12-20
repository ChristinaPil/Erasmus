package entities;


	import java.io.Serializable;

	public class Headsecretary implements Serializable  {

		private String fullname;
		private int id;
		private String username;
		private String password;
		
		public String getFullname() {
			return fullname;
		}
		public Headsecretary() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Headsecretary [name=" + fullname + ", id=" + id + "]";
		}
		public Headsecretary(String fullname, int id, String username, String password) {
			super();
			this.fullname = fullname;
			this.id = id;
			this.username = username;
			this.password = password;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}
		
		
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
	}
		
