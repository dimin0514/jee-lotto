package com.lotto.web.services;

import com.lotto.web.domains.LottoBean;

public interface LottoService {

	public void cerateLotto(LottoBean param);
	public String createLottoSeq();
	public int createBallNum();
	public String createLotteryNum();
	public boolean exist(int[] arr, int a);
	public int[] bubbleSort(int[] arr, boolean flag);

}
