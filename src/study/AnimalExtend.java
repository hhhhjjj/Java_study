package study;

public class AnimalExtend {
//���class�����н���
//	����ļ����ж���ֻ࣬����һ����public
//	���publicҪ���ļ�������ͬ
//	���û��public����ôֻҪ��һ�������ֺ��ļ���һ������
	private String name;  
    private int id; 
    public AnimalExtend(String myName, int myid) { 
        name = myName; 
        id = myid;
    } 
    public void eat(){ 
        System.out.println(name+"���ڳ�"); 
    }
    public void sleep(){
        System.out.println(name+"����˯");
    }
    public void introduction() { 
        System.out.println("��Һã�����"         + id + "��" + name + "."); 
    } 
}




