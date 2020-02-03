package study;

public class AnimalExtend {
//这个class名字有讲究
//	如果文件中有多个类，只能有一个是public
//	这个public要和文件名字相同
//	如果没有public，那么只要有一个类名字和文件名一样就行
	private String name;  
    private int id; 
    public AnimalExtend(String myName, int myid) { 
        name = myName; 
        id = myid;
    } 
    public void eat(){ 
        System.out.println(name+"正在吃"); 
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() { 
        System.out.println("大家好！我是"         + id + "号" + name + "."); 
    } 
}




