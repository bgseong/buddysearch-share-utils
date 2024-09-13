package com.adnj.buddysearchshareutils.utils;

import com.adnj.buddysearchshareutils.dto.CustomUserInfoDto;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

@Slf4j
@Component
public class JwtUtil {

    private final Key key;
    private final long accessTokenExpireTime;
    private final long refreshTokenExpireTime;

    public JwtUtil(@Value("${jwt.secret}") String secretKey,
                   @Value("${jwt.access_expiration_time}") long accessTokenExpTime,
                   @Value("${jwt.refresh_expiration_time}") long refreshTokenExpTime) {
        byte[] keyByte = Base64.getDecoder().decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyByte);
        this.accessTokenExpireTime = accessTokenExpTime;
        this.refreshTokenExpireTime = refreshTokenExpTime;
    }

    public String createAccessToken(CustomUserInfoDto member) {
        return createAccessToken(member, accessTokenExpireTime);
    }

    public String createAccessToken(UUID id, String role) {
        return createAccessToken(id, role, accessTokenExpireTime);
    }

    public String createRefreshToken(CustomUserInfoDto member) {
        return createRefreshToken(member, refreshTokenExpireTime);
    }

    public String createRefreshToken(UUID id, String role) {
        return createRefreshToken(id, role, refreshTokenExpireTime);
    }

    /**
     * JWT 생성
     * @param member
     * @param expireTime
     * @return JWT String
     */
    private String createAccessToken(CustomUserInfoDto member, long expireTime) {
        Claims claims = Jwts.claims();
        claims.put("id", member.getEmail());
        claims.put("role", member.getRole());
        claims.put("type", "access");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime tokenValidity = now.plusSeconds(expireTime);


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(tokenValidity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    private String createAccessToken(UUID id, String role, long expireTime) {
        Claims claims = Jwts.claims();
        claims.put("id", id.toString());
        claims.put("role", role);
        claims.put("type", "access");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime tokenValidity = now.plusSeconds(expireTime);


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(tokenValidity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    private String createRefreshToken(CustomUserInfoDto member, long expireTime) {
        Claims claims = Jwts.claims();
        claims.put("id", member.getEmail());
        claims.put("role", member.getRole());
        claims.put("type", "refresh");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime tokenValidity = now.plusSeconds(expireTime);


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(tokenValidity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    private String createRefreshToken(UUID id, String role, long expireTime) {
        Claims claims = Jwts.claims();
        claims.put("id", id.toString());
        claims.put("role", role);
        claims.put("type", "refresh");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime tokenValidity = now.plusSeconds(expireTime);


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(tokenValidity.toInstant()))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }


    /**
     * Token에서 User ID 추출
     * @param token
     * @return User ID
     */
    public String getUserId(String token) {
        return parseClaims(token).get("id", String.class);
    }

    public String getType(String token){
        return parseClaims(token).get("type",String.class);
    }


    /**
     * JWT 검증
     * @param token
     * @return IsValidate
     */
    public boolean validateToken(String token) {
        Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
        return true;
    }


    /**
     * JWT Claims 추출
     * @param Token
     * @return JWT Claims
     */
    public Claims parseClaims(String Token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(Token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }

    public long getRefreshTokenExpireTime() {
        return refreshTokenExpireTime;
    }
}
