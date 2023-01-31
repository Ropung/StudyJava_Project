package net.kdigital.score.service;

import java.util.List;

import net.kdigital.score.dao.StudentDao;
import net.kdigital.score.vo.StudentVo;

public class StudentService {
//	List<StudentVo> list = new ArrayList<>();
	StudentDao dao = new StudentDao();

	public StudentVo selectByID(Integer id) {

		return dao.selectByID(id);
	}

	public List<StudentVo> selectAll() {
		return dao.selectAll();
	}

	public int studentAdd(StudentVo student) {

		return dao.studentAdd(student);
	}

	public int removeStudent(Integer id) {
		return (int) dao.removeStudent(id);
	}

	public int updateStudent(StudentVo student) {

		return dao.updateStudent(student);
	}

}
