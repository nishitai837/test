
public class Test {
	
	public static void main(String[] args) {
		
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-0000-0000";
		taro.address = "taro@";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		
		Person jiro = new Person();
		jiro.name = "木村二郎";
		jiro.age = 18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
	}
	
	

}
