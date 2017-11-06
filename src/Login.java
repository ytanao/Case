

/**
 * 
 * @author Administrator 
 * 1.创建一个Login的类，有输入项username和password
 * 2.其中username要求是1开关的11位手机号（限制是1开头，11位） 
 * 3.密码要求是6位数字（100000~999999）
 * 4.要实现，实例化一个登录对象的时候就输入用户名和密码 
 * 5.设计一个登录的方法，当密码=用户名的最后6位时，登录成功，否则登录失败。
 */
public class Login {
	private String userName;
	private String passWord;

	public Login() {
		super();
	}

	public Login(String userName, String passWord) {
		super();
		this.setUserName(userName);
		this.setPassWord(passWord);
		login_ver();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName.matches("1\\d{10}")) {
			this.userName = userName;
		} else {
			System.out.println("用户名不正确");
			System.exit(0);
		}

	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		if (passWord.matches("\\d{6}")) {
			this.passWord = passWord;
		} else {
			System.out.println("密码不正确");
			System.exit(0);
		}

	}

	public void login_ver() {
		if (userName == null || passWord == null) {
			System.out.println("用户名或密码不能为空");
			System.exit(0);
		} else if (passWord.equals(userName.substring(userName.length() - 6))) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

	}

	public static void main(String[] args) {
		new Login("12345678912", "678912");
	}

}
