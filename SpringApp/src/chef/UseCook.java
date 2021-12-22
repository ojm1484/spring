package chef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tool.ElectPan;
import tool.Pan;
import view.MyFrame;

public class UseCook {

	public static void main(String[] args) {
		//javaEE에서는 앞으로 개발자가 자바코드 안에서 해당클래스를 직접 new하지 말고
		//객체를 관리해주는 스프링 프레임웍을 이용하여 주입받아 사용하자.
		//스프링 프레임웍의 객체들 중 설정xml을 해석 및 실행 한 후 객체들을 메모리에 올리고
		//관리해주는 객체를 가리켜 빈(객체)컨테이너라 하며 이 컨테이너를 표현한 객체가 바로
		//ApplicationContext이다.
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring/config/context.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/config/swing-context.xml");
		
		
	//	Cook cook=(Cook)context.getBean("cook");
	//	cook.makeFood();
		MyFrame myFrame=(MyFrame)context.getBean("myFrame");
		
		
	}

}
