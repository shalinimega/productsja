package com.product.globle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.product.exception.TypeNotFoundException;

@RestControllerAdvice
public class GlobleHandling {
	@ExceptionHandler(TypeNotFoundException.class)
	public ResponseEntity<Object> globleHander()
	{
		return new ResponseEntity<>("Give a proper input",HttpStatus.ACCEPTED);
	}

}

