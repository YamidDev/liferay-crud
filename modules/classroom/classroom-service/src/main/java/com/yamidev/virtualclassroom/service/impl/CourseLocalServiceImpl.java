package com.yamidev.virtualclassroom.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.yamidev.virtualclassroom.model.Course;
import com.yamidev.virtualclassroom.service.base.CourseLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

@Component(
	property = "model.class.name=com.yamidev.virtualclassroom.model.Course",
	service = AopService.class
)
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {

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
}