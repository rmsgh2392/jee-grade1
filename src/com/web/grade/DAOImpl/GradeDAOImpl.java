package com.web.grade.DAOImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.web.grade.DAO.GradeDAO;
import com.web.grade.domains.GradeBean;

public class GradeDAOImpl implements GradeDAO{
	public static final String FILE_PATH = String.format
			("C:%sUsers%suser%seclipes-jee%sjee-grade1%sWebContent%sresources%stxt%s"
																					,File.separator
																					,File.separator
																					,File.separator
																					,File.separator
																					,File.separator
																					,File.separator
																					,File.separator
																					,File.separator);
	public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
	@Override
	public void insertDAO(GradeBean param) {
		try {
			File file = new File(FILE_PATH +"Gradetest.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(param.toString());
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
