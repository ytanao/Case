

/**
 * 
 * @author Administrator 
 * 1.����һ��Login���࣬��������username��password
 * 2.����usernameҪ����1���ص�11λ�ֻ��ţ�������1��ͷ��11λ�� 
 * 3.����Ҫ����6λ���֣�100000~999999��
 * 4.Ҫʵ�֣�ʵ����һ����¼�����ʱ��������û��������� 
 * 5.���һ����¼�ķ�����������=�û��������6λʱ����¼�ɹ��������¼ʧ�ܡ�
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
			System.out.println("�û�������ȷ");
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
			System.out.println("���벻��ȷ");
			System.exit(0);
		}

	}

	public void login_ver() {
		if (userName == null || passWord == null) {
			System.out.println("�û��������벻��Ϊ��");
			System.exit(0);
		} else if (passWord.equals(userName.substring(userName.length() - 6))) {
			System.out.println("��¼�ɹ�");
		} else {
			System.out.println("��¼ʧ��");
		}

	}

	public static void main(String[] args) {
		new Login("12345678912", "678912");
	}

}
