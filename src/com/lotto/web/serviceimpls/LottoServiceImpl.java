package com.lotto.web.serviceimpls;

import java.util.List;
import java.util.Random;

import com.lotto.web.daoimps.LottoDAOImpl;
import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService {
	private LottoDAO dao;
	
	public LottoServiceImpl() {
		dao= new LottoDAOImpl();
	}

	@Override
	public void cerateLotto(LottoBean param) {  //리턴값이 없는거 할때는 void로 하자...
		
		param.setBall(createBallNum());
		param.setLotteryNum(createLotteryNum());
		param.setLottoSeq(createLottoSeq());
		dao.insertLotto(param);
		
	}
	@Override
	public String createLottoSeq() {     //없는거 만드는건 이런형식
		Random r = new Random();
		String seq = "No.";
		for(int i=0;i<4;i++) {
			seq+= r.nextInt(10)+"";
		}
		System.out.println(seq);
		return seq; 
	}
	
	@Override
	public String createBallNum() {
		Random r = new Random();
		String temp = r.nextInt(45)+1+"";
		System.out.println(temp);
		//return new Random().nextInt(45)+1+""; 줄이면
		return temp;
	}
	@Override
	public String createLotteryNum() {
		Random r = new Random();
		String num="";
		for(int i=0;i<6;i++) {
			num+=r.nextInt(45)+1+" ";
		}	
		System.out.println(num);
		return num;
	}
	
	@Override
	public boolean duplicatePrevention(int[] arr) {
		
		return false;
	}
	
	@Override
	public String ascendingSort(int[] arr) {
		return null;
	}
	

}
