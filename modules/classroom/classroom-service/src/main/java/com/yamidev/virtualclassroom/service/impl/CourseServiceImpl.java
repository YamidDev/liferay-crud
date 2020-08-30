package com.yamidev.virtualclassroom.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.yamidev.virtualclassroom.model.Course;
import com.yamidev.virtualclassroom.service.base.CourseServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component(
	property = {
		"json.web.service.context.name=vc",
		"json.web.service.context.path=Course"
	},
	service = AopService.class
)
public class CourseServiceImpl extends CourseServiceBaseImpl {
	public Course addCourse(long groupId, Map<Locale, String> name, String description, ServiceContext serviceContext)
			throws PortalException {
		return courseLocalService.addCourse(groupId, name, description,serviceContext);
	}

	public List<Course> findByGroupId(long groupId){
		return courseLocalService.findByGroupId(groupId);
	}
}