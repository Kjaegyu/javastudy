package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetpropertyExample {

	public static void main(String[] args) {
		//운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("userName");
		String userHome = System.getProperty("userHome");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//전체 키와 값을 출력
		System.out.println("--------------------");
		System.out.println(" key :  vulue");
		System.out.println("--------------------");
		Properties props = System.getProperties();
		Set Keys = props.keySet();
		for(Object objKey : Keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key ,value);
		}
	}	

}
