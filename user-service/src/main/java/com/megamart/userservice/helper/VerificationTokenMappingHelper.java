package com.megamart.userservice.helper;

import com.megamart.userservice.dto.VerificationTokenDto;
import com.megamart.userservice.model.VerificationToken;

public class VerificationTokenMappingHelper {

	public static VerificationToken map(final VerificationTokenDto dto) {
		VerificationToken token = new VerificationToken();
		
		token.setExpireDate(dto.getExpireDate());
		token.setToken(dto.getToken());
		token.setCredentialId(dto.getCredentialId());
		token.setVerificationTokenId(dto.getVerificationTokenId());
		return token;
	}
	
	
	public static VerificationTokenDto map(final VerificationToken token) {
		VerificationTokenDto dto = new VerificationTokenDto();
		dto.setExpireDate(token.getExpireDate());
		dto.setToken(token.getToken());
		dto.setCredentialId(token.getCredentialId());
		dto.setVerificationTokenId(token.getVerificationTokenId());
		return dto;
	}
}
