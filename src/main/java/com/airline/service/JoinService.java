package com.airline.service;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.airline.vo.KakaoUserVO;
import com.airline.vo.TermsVO;

public interface JoinService {

	public String confirmEmail(String email); //아이디찾기 시 이메일이 존재하는지 확인 

	public String confirmUserIdAndEmail(String userId, String email); //비밀번호 찾기 시 이메일이 존재하는지 확인 
	
	public void modifyPwdByMailKey(String userId, String mail_key); //새비밀번호(랜덤키)로 업데이트
	
	public KakaoUserVO showUserId(String email, String mail_key); //아이디찾기 시 이메일을 기준으로 랜덤키 생성해서 컬럼에 저장

	public KakaoUserVO confirmMember(KakaoUserVO vo);
	
	public String getAccessToken(String authorize_code) throws Throwable;
	
	public HashMap<String, Object> getUserInfo(String access_Token) throws Throwable;
	public int userIdDuplicateCheck(String userId);
	public int userNickDuplicateCheck(String userNick);
	
	public TermsVO getTerms(int termsCode);
	
	public void registerMember(String userId, String userNick,String userNameK,  String userNameE, 
			String gender, String pwd, int userReginumFirst, int userReginumLast, int postCode, 
			String phone,
			String mail,
			String address);
	//vo로 받고싶은데 phone, email, address를 못합침..->일단 파라미터로 받음..	

}
 