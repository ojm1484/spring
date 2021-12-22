package school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//학생 클래스를 사용해보자
public class UseStudent {

	public static void main(String[] args) {
		//개발자가 설정한 스프링 빈 설정 파일을 읽어 빈들의 인스턴스를 생성 및 관리하는 객체인 
		//applicationContext를 만들어보자
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/aop-context.xml");
		
		
		Student st= (Student)context.getBean("student");
		st.studyEng();
		st.studyMath();
		st.studySci();
		st.haveLunch();
	}
}
