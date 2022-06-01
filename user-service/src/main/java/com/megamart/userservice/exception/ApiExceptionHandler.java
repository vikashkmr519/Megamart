package com.megamart.userservice.exception;


import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.megamart.userservice.exception.payload.ExceptionMsg;
import com.megamart.userservice.exception.wrapper.AddressNotFoundException;
import com.megamart.userservice.exception.wrapper.CredentialNotFoundException;
import com.megamart.userservice.exception.wrapper.UserObjectNotFoundException;
import com.megamart.userservice.exception.wrapper.VerificationTokenNotFoundException;


@ControllerAdvice
public class ApiExceptionHandler{

	private static final Logger log = LoggerFactory.getLogger(ApiExceptionHandler.class);

	@ExceptionHandler(value = {
			MethodArgumentNotValidException.class,
			HttpMessageNotReadableException.class
		})
		public <T extends BindException> ResponseEntity<ExceptionMsg> handleValidationException(final T e) {
			
			log.info("**ApiExceptionHandler controller, handle validation exception*\n");
			final var badRequest = HttpStatus.BAD_REQUEST;
			
			ExceptionMsg msg = new ExceptionMsg();
			msg.setMsg("*" + e.getBindingResult().getFieldError().getDefaultMessage()+"!**");
			msg.setHttpStatus(badRequest);
			msg.setTimestamp(ZonedDateTime.now(ZoneId.systemDefault()));
			return new ResponseEntity<>(msg,badRequest);
		}
		
		@ExceptionHandler(value = {
			UserObjectNotFoundException.class,
			CredentialNotFoundException.class,
			VerificationTokenNotFoundException.class,
			AddressNotFoundException.class
		})
		public <T extends RuntimeException> ResponseEntity<ExceptionMsg> handleApiRequestException(final T e) {
			
			log.info("**ApiExceptionHandler controller, handle API request*\n");
			final var badRequest = HttpStatus.BAD_REQUEST;
			ExceptionMsg msg = new ExceptionMsg();
			msg.setHttpStatus(badRequest);
			msg.setMsg("#### " + e.getMessage() + "! ####");
			msg.setTimestamp(ZonedDateTime.now(ZoneId.systemDefault()));
			return new ResponseEntity<>(msg,badRequest);
		}
		
	

}
