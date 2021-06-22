package springbootex;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * BootStrap Class
 * 1. 스프링 부트 애플리케이션 부트스트래핑(BootStrapping)
 * 어떤일을 시작하기 위한 모든 준비를 끝마치는 것(wiring)
 * 2. 설정 클래스로 역할(configuration Class)
 */
/* @SpringBootApplication 메타 어노테이션
 * (@SpringBootConfiguration(alias for @Configuration) + 
 * @ComponentScan + 
 * @EnableAutoConfiguration)
 * 
 */

@SpringBootApplication
public class HelloWorldApplication {
	
	@Bean
	public ApplicationRunner applicationRunner() {
		// 1. 작성된 구현 클래스를 사용
		// return new HelloWorldRunner();
		
		// 2. 익명 클래스 사용
//		return new ApplicationRunner() {
//			 @Override
//			public void run(ApplicationArguments args) throws Exception {
//				 System.out.println("hello world");
//			}
//		};
//		
		// 3. 함수형(람다 표현식)
		return (ApplicationArguments args) -> {
			System.out.println("hello world");
		};
	}
	
	public static void main(String[] args) {
		/**
		 * main을 통해서 run을 해서 bootstrapping을 하는 거임(+wiring)
		 * 1. 애플리케이션 컨텍스트(Application Context, 컨테이너) 생성
		 * 2. 애플리케이션 타입 결정 (web - servlet, reactive)
		 * 3. 어노테이션 스캐닝을 통한 빈 생성 및 등록
		 * 4. 웹 애플리케이션인 경우 (web)
		 * 		- 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 * 		- 서버 인스턴스에 웹 애플리케이션 배포
		 * 		- 서버 인스턴스 실행
		 * 5. 인터페이스ApplicationRunner 구현 빈의 run() 실행
		 */
		
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	
}
