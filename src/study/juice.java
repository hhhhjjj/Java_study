package study;

class JuiceClass {
	enum JuiceSize {SMALL, MEDIUM, LARGE}
	JuiceSize size;
}



public class juice {
	public static void main(String[] args) {
		JuiceClass a_juice = new JuiceClass();
		a_juice.size = JuiceClass.JuiceSize.MEDIUM;
//�����Ӷ�����һ����֭���ͺ�
	}

}
