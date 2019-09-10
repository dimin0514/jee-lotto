package com.lotto.web.daoimps;
import com.lotto.web.daos.ConsumerDAO;
import com.lotto.web.domains.ConsumerBean;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ConsumerDAOImpl implements ConsumerDAO{
	public static final String FILE_PATH= String.format("C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s",File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);
	
	public static final String VIEW_PATH="WEB-INF/views/%s/%s.jsp";

	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(FILE_PATH+"consumers.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s,%s", param.getCid(), param.getPass()));
			writer.newLine();
			writer.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
