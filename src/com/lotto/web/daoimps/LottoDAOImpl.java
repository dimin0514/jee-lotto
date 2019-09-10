package com.lotto.web.daoimps;

import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class LottoDAOImpl implements LottoDAO {
	public static final String FILE_PATH= String.format("C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s",File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);


	@Override
	public void insertLotto(LottoBean param) {
		try {
			File file = new File(FILE_PATH+"lotto.txt");  // 파일저장
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true)); //모아서 보내기 위해서 버퍼 사용. 객체는 무저건.. 메서드 안에 있으니깐 new 클래스면 ...
			writer.write(param.getLottoSeq()+"/"+param.getLotteryNum());
			writer.newLine();      // 여기까지가 메모리에 저장 깃허브의 커밋 같은 느낌.
			writer.flush();        //여기서 로또 파일에 저장 . 
			
			
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
