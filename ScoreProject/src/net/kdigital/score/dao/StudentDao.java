package net.kdigital.score.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.kdigital.score.vo.StudentVo;

public class StudentDao {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public StudentVo selectByID(Integer id) {
		SqlSession session = null;
		session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		StudentVo student = mapper.selectByID(id);

		session.close();
		return student;
	}

	public List<StudentVo> selectAll() {
		SqlSession session = null;
		session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<StudentVo> list = mapper.selectAll();

		session.close();
		return list;
	}

	public int studentAdd(StudentVo student) {
		SqlSession session = null;
		session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		int result = mapper.studentAdd(student);

		session.commit();
		session.close();
		return result;
	}

	public Object removeStudent(Integer id) {
		SqlSession session = null;
		session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);

		int result = mapper.removeStudent(id);

		session.commit();
		session.close();
		return result;
	}

	public int updateStudent(StudentVo student) {
		SqlSession session = null;
		session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);

		int result = mapper.updateStudent(student);

		session.commit();
		session.close();
		return result;
	}

}
