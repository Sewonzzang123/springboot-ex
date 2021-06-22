package springbootEx;
//junit5 (junit.jupiter)
//@SpringBootTest 에서 클래스를 지정해 주지 않아도 된다 
// 지정해 주지 않게 되면 하위 패키지를 다 뒤져서 @SpringBootConfiguration (@Configuration은 ㄴㄴ)을 찾아냄

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import springbootex.HelloWorldApplication;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {HelloWorldApplication.class})
@SpringBootTest(classes= {HelloWorldApplication.class})
public class HelloWorldApplicationTest {

	@Test
	public void contextLoads() {
		
	}
}
