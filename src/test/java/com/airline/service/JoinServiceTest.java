package com.airline.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.airline.vo.KakaoUserVO;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JoinServiceTest {
	
	@Autowired
	private JoinService join;

	@Test
	public void confirmMemberTest() {
		String userNameE = "userchoi";
		String userNameK = "최유저";
		String gender="M";
		int userReginumFirst = 881231;
		int userReginumLast = 1111111;
		
		join.confirmMember(userNameE, userNameK, gender, userReginumFirst, userReginumLast);
	}
	
	@Test
	public void kakaoLoginTest() throws Throwable {
		join.getAccessToken("2W4AQCGwhnwzYQ8Z8ONcyJkOY0pPlZlNjmQ-u-93GZhgoQ-VcQpnIhzBLI4KPXUbAAABjBpMLq7_A_o_BVb6-Q");
		//responseCode : 200 이면 성공
	}
	
	@Test
	public void getUserInfoTest() throws Throwable {
		String access_Token = join.getAccessToken("AUscawGq3fxoOX0-4mMOFXyD77ee27pCAbmT28CDtewpO7DGF462t07nGtcKPXLrAAABjB4Q2qkFVMIyByjmyg");
		join.getUserInfo(access_Token);
	}

}
