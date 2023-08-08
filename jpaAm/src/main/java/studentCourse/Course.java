package studentCourse;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "sc.Course")
@Table(name = "mtm_course_1")
public class Course {
	@Id
	@Column
	private int course_id;
	@Column
	private String course_name;
	@ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
	Set<Student> students;

	
	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + course_id + ", course_name=" + course_name + ", students=" + students + "]";
	}

}
