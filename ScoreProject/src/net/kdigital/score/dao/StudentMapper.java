package net.kdigital.score.dao;

import java.util.List;

import net.kdigital.score.vo.StudentVo;

public interface StudentMapper {

	public List<StudentVo> selectAll();

	public StudentVo selectByID(Integer id);

	public int studentAdd(StudentVo student);

	public int removeStudent(Integer id);

	public int updateStudent(StudentVo student);

}
