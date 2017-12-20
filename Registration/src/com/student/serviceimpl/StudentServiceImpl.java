package com.student.serviceimpl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.student.dao.StudentOperationsDAO;
import com.student.entity.Response;
import com.student.entity.Student;
import com.student.service.StudentService;

@Path("student")

public class StudentServiceImpl implements StudentService {
	private StudentOperationsDAO studentDAO = new StudentOperationsDAO();

	@Override
	@Path("/register")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Response registerStudent(Student s) {
		studentDAO.addNewStudentDAO(s);
		Response res = new Response();
		res.setResponseMessage("Student Successfully added");
		res.setStatus(true);
		return res;
	}

	@Override
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response deleteStudent(@PathParam("id") int id) {
		studentDAO.removeStudentDAO(id);
		Response res = new Response();
		res.setResponseMessage("Student Successfully deleted");
		res.setStatus(true);
		return res;
	}

	@Override
	@Path("/get/{studentID}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Student getStudent(@PathParam("studentID") int studentID) {
		Student s = studentDAO.getStudentDAO(studentID);
		return s;
	}

	@Override
	@Path("/getallstudents")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<Student> getAllStudents() {
		List<Student> allStudents = studentDAO.getAllStudentsDAO();
		return allStudents;
	}

	@Override
	@Path("/update/{studentID}")
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public Response updateStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

}
