package com.syj.spring.ex.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syj.spring.ex.db.domain.UsedGoods;
import com.syj.spring.ex.db.repository.UsedGoodsRepository;

// 로직(business)를 담당
@Service
public class UsedGoodsService {

	// 멤버변수 생성 -> Autowired 통해 스프링 프레임워크가 자동으로 직접 객체 생성
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	// 중고물품 게시글 리스트를 리턴 하는 기능(컨트롤러에서 필요로 하는 기능)
	public List<UsedGoods> getUsedGoodsList() {
		
		// usedGoods 테이블 데이터 조회
		// 레파지토리를 통해 테이블을 불러오는 메소드 불러와야 한다
		
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		return usedGoodsList;
	}
		
}
