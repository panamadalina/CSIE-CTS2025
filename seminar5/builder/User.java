package seminar5.builder;

public class User
{
	//All final attributes
	private String firstName; // required
	private String lastName; // required
	private String birthday; // optional
	
	private String phone; // optional
	private String address; // optional

	private User() {
		
	}

	//All getter, and NO setter to provide immutability
	//OR PRIVATE SETTERS!!
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}


	public static class UserBuilder 
	{
		private User user;
		
		public UserBuilder(String firstName, String lastName) {
			this.user=new User();
			//mandatory fields
			this.user.firstName = firstName;
			this.user.lastName = lastName;
		}
		public UserBuilder birthday(String birthday) {
			this.user.birthday = birthday;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.user.phone = phone;
			return this;
		}
		public UserBuilder address(String address) {
			this.user.address = address;
			return this;
		}
//		//Return the final constructed User object
		public User build() {
			return this.user;
		}
	}
} 