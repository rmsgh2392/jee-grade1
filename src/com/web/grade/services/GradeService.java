package com.web.grade.services;

import com.web.grade.domains.GradeBean;

public interface GradeService {
	public void createGrade(GradeBean param);
	public String createHakbun(GradeBean param);
	public int GradeSum(GradeBean param);
	public int GradeAvg(GradeBean param);
}
