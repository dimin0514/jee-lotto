package com.lotto.web.serviceimpls;

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
		param.setBall(createBallNum()+"");
		param.setLotteryNum(createLotteryNum());
		param.setLottoSeq(createLottoSeq());
		dao.insertLotto(param);
		
	}
	@Override
	public String createLottoSeq() {     //없는거 만드는건 이런형식
		String result="No.";
		Random ran= new Random();
		for (int i = 0; i < 4; i++) {
			result += ran.nextInt(9) + "";
		}
		return result;
	}
	
	@Override
	public int createBallNum() {
		int result=0;
		Random ran= new Random();
		result=ran.nextInt(45)+1;
		
		return result;
		
		
		//Random r = new Random();
		//String temp = r.nextInt(45)+1+"";
		//return temp;
		//혹은 합쳐서 return new Random().nextInt(45)+1; 줄이면
	}
	@Override
	public String createLotteryNum() {
		String result="";
		int arr[] = new int[6];
		for(int i=0;i<arr.length;i++) {
			int a = createBallNum();
			if(exist(arr, a)) {
				arr[i]=a;
			}else {
				i--;
			}
		}
		arr=bubbleSort(arr,true);      //true : ascending , false 는 역차순....
		for(int i=0;i<arr.length;i++) {
			result +=i+",";
		}
		return result;
	}
	
	/*다른 방식 풀이!! 잘 이해되는걸로 이해하자.. 
	 * 
	 * public String createLotteryNum() {
	 * 	String result= "";
	 * 	int[] arr = new int[6];  미세조정은 배열. list 도 좋지만 작은건 배열
	 * 
	 *	for(int i=0 ;i<arr.length;i++){
	 *		result += (i!=arr.length=1)? arr[i]+","+arr[i];
	 *	}
	 * 
	 * 	return result;
	 */
	
	@Override
	public boolean exist(int[] arr, int a) {
		boolean b = false;
		for (int i : arr) {
			if (a == i) {
				b = true;
			}
		}

		return b;
	}
	
	@Override
	 public int[] bubbleSort(int[] arr, boolean flag)  {
		int t = 0;
		for (int k=0; k<arr.length;k++) {
			for (int i=0;i< arr.length-1;i++) {
				if (flag) {
					if (arr[i] >arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;
					}
				} else {
					if (arr[i] < arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;
					}
				}
			}
		}
		return arr;
	}
}
