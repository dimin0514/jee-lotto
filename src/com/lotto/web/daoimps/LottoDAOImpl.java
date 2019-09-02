package com.lotto.web.daoimps;

import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

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
			File file = new File(FILE_PATH+"lotto.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			
			
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
