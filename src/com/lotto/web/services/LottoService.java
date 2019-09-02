package com.lotto.web.services;

import com.lotto.web.domains.LottoBean;

public interface LottoService {

	public void cerateLotto(LottoBean param);
	public String createLottoSeq();
	public String createBallNum();
	public String createLotteryNum();
	public boolean duplicatePrevention(int[] arr);
	public String ascendingSort(int[] arr);

}
