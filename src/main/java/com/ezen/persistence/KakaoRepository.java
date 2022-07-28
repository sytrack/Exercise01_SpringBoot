package com.ezen.persistence;

import org.springframework.data.repository.CrudRepository;

import com.ezen.domain.Kakao;

public interface KakaoRepository extends CrudRepository<Kakao, Long> {

}
