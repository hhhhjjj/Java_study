package study;

class JuiceClass {
	enum JuiceSize {SMALL, MEDIUM, LARGE}
	JuiceSize size;
//	�����ʵ����ö�٣�ֻ����Ԥ���趨�õ�ֵ
}



public class juice {
	public static void main(String[] args) {
		JuiceClass a_juice = new JuiceClass();
		a_juice.size = JuiceClass.JuiceSize.MEDIUM;
		//�����Ӷ�����һ����֭���ͺ�
		System.out.print(a_juice.size);
// println���Դ����з���print�������з���printf�Ǹ�ʽ�����

	}

}
