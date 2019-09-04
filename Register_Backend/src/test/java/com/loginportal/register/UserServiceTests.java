//package com.loginportal.register;
//
//import static org.junit.Assert.assertEquals;
//
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestTemplate;
//
//import com.loginportal.register.model.CustomPasswordEncoder;
//import com.loginportal.register.model.Password;
//import com.loginportal.register.model.SecurityAnswer;
//import com.loginportal.register.model.User;
//import com.loginportal.register.repository.UserRepository;
//import com.loginportal.register.service.UserService;
//import com.loginportal.register.service.UserServiceImpl;
//
//
//
//
//@RunWith(SpringRunner.class)
//public class UserServiceTests {
//	
//	User user =new User();
//    User emptyuser = new User();
//    Password password= new Password();
//    SecurityAnswer securityAns= new SecurityAnswer();
//    
//    @TestConfiguration
//    static class DataServiceTestContextConfiguration {
//        @Bean
//        public UserService userService() {
//            return new UserServiceImpl();
//        }
//    }
//    
//	@MockBean
//	 @Qualifier(value = "userRepository")
//	static
//	
//	UserRepository userrepo;
//	
//	@MockBean 
//	CustomPasswordEncoder cutompasswordencoder;
//	@Autowired
//	private UserService userService;
//	
//	@MockBean
//	RestTemplate restTemplate;
//	@Before
//    public void setUp() {
//    	//super.setUp();
//       password.setPwd1("pavani@23");
//       securityAns.setSecurityQueID1(1);
//       securityAns.setSecurityAnsID1("CTC");
//       securityAns.setSecurityQueID2(2);
//       securityAns.setSecurityAnsID2("DDLJ");
//       user.setFirstName("Pavani");
//       user.setLastName("Nemuri");
//       user.setEmailID("pavaninemuri8@gmail.com");
//       user.setPhoneNo("1234567891");
//       user.setPasswordHistory(password);
//       user.setSecurityAns(securityAns);
//       user.setAccountCreationTime(null);
//       
//      
////       String salt1 = BCrypt.gensalt(12);
////       Password pwd = user.getPasswordHistory();
//       Mockito.when(cutompasswordencoder.encodeWithSalt(Mockito.any(String.class),Mockito.any(String.class))).thenReturn("$2a$12$2jDJzTrQ9UOP43LVEyrdweLBe10SA0csWa5EzsHlQm0suxaWv7UqS");
//       
//
//    }
//	
////	 @Test
////	    public void registerUser()  {
////		 User user1 = userService.saveUser(user);
////		 assertEquals(user1,  user);
////		// System.out.println(user1);    
////	 }   	
//
//  }
