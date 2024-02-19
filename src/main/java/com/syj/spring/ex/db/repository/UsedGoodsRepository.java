package com.syj.spring.ex.db.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.syj.spring.ex.db.domain.UsedGoods;

@Mapper
public interface UsedGoodsRepository {

	// 어떤 쿼리를 통해 데이터 베이스 테이블을 다루는지만 수행하는 기능
	// 테이블 불러오는 메소드 정의하면 끝
	
	// 데이터 베이스에 접속 -> 쿼리 문자열 -> 쿼리 수행 -> 수행 결과 얻어오기 -> 사용하기 편리한 데이터로 변환
	// Mybatis Framework
	// 레파지토리 인터페이스 - xml 파일에서 연결해서 구현
	
	// used_goods 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList();
	
}
