package study;

public class TestFantj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "fantj";
        String b = "fantj";
        //a��b ��浽�����������������һ��set���ϣ����������ظ���ֵ�����Լ���ڶ����ظ���ֵ�᷵���Ѵ���ֵ������
        System.out.println(a == b);
        //new������ʵ����һ�����󣬻�����ŵ����С�
        String c = new String("fantj");
        //����a��c�Ƚϣ�a�ڳ����أ�c�ڶѣ������϶���ͬ�������Ȼ��ͬ������false
        System.out.println(a == c);
        //a��c.intern�Ƚϣ�intern���c�ᵽ�����أ����Լ���ڶ����ظ���ֵ�᷵���Ѵ���ֵ������������true
        System.out.println(a == c.intern());
	}

}
