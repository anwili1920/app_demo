package com.qradardemo.app.utils;

import java.util.Date;
import java.util.Map;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtils {
    public static String build(long exp, Map<String, Object> claims, String secret) {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		long nowMillis = System.currentTimeMillis();
		Date expt = new Date(nowMillis + exp * 1000);	
		JwtBuilder builder = Jwts.builder().addClaims(claims)
	            .signWith(signatureAlgorithm, secret.getBytes())
	            .setExpiration(expt);
	    return builder.compact();
	}
}
