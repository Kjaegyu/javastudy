package ch16.sec00;

public class MyFunctionInterfaceExample {

public static void main(String[] args) {
		
		MyFunctionInterface fi;
		
		fi = () ->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () ->{System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();

	}

}

