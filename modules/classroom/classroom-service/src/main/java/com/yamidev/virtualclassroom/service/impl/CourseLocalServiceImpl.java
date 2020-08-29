package com.yamidev.virtualclassroom.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.yamidev.virtualclassroom.model.Course;
import com.yamidev.virtualclassroom.service.base.CourseLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component(
	property = "model.class.name=com.yamidev.virtualclassroom.model.Course",
	service = AopService.class
)
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {
	private int end;
	public Course addCourse(long groupId, Map<Locale, String> name, String description, ServiceContext serviceContext) throws PortalException {
		long courseId = counterLocalService.increment(Course.class.getName());

		Course course = super.createCourse(courseId);
		course.setNameMap(name);
		course.setDescription(description);
		course.setUserId(serviceContext.getUserId());
		User user = userLocalService.getUser(serviceContext.getUserId());
		course.setUserName(user.getFullName());
		course.setCreateDate(serviceContext.getCreateDate(new Date()));

		return super.addCourse(course);
	}

	public Course updateCourse(long courseId, Map<Locale, String> name, String description, ServiceContext serviceContext) throws PortalException {
		Course course = getCourse(courseId);

		course.setNameMap(name);
		course.setDescription(description);
		course.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		return super.updateCourse(course);
	}

	public List<Course> findByUserId(long userId){
		return coursePersistence.findByUserId(userId);
	}
	public List<Course> findByUserId(long userId, int start) {
		return coursePersistence.findByUserId(userId, start, end);
	}
	public int countByUserId(long userId){
		return coursePersistence.countByUserId(userId);
	}
	public List<Course> findByGroupId(long groupId){
		return coursePersistence.findByGroupId(groupId);
	}
	public List<Course> findByGroupId(long groupId, int start){
		return coursePersistence.findByGroupId(groupId, start, end);
	}
	public int countByGroupId(long groupId){
		return coursePersistence.countByGroupId(groupId);
	}
	public List<Course> findByU_G(long userId, long groupId){
		return coursePersistence.findByU_G(userId, groupId);
	}
	public List<Course> findByU_G(long userId, long groupId, int start, int end){
		return coursePersistence.findByU_G(userId, groupId, start, end);
	}
	public int countByU_G(long userId, long groupId){
		return coursePersistence.countByU_G(userId, groupId);
	}
}