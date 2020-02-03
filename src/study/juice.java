package study;

class JuiceClass {
	enum JuiceSize {SMALL, MEDIUM, LARGE}
	JuiceSize size;
//	这个其实就是枚举，只能用预先设定好的值
}



public class juice {
	public static void main(String[] args) {
		JuiceClass a_juice = new JuiceClass();
		a_juice.size = JuiceClass.JuiceSize.MEDIUM;
		//这样子定义了一杯果汁的型号
		System.out.print(a_juice.size);
// println是自带换行符，print不带换行符，printf是格式化输出

	}

}
