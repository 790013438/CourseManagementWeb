package snippets.web.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import snippets.dto.CourseDTO;
import snippets.ejb.CourseBeanRemote;

@ManagedBean(name="Course")
public class CourseJSFBean {
    @EJB
    CourseBean courseBean;

    public List<CourseDTO> getCourses() {
        return courseBean.getCourses();
    }
}
