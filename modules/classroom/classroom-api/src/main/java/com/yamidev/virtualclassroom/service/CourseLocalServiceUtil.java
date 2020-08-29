package com.yamidev.virtualclassroom.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

public class CourseLocalServiceUtil {

	public static com.yamidev.virtualclassroom.model.Course addCourse(
		com.yamidev.virtualclassroom.model.Course course) {

		return getService().addCourse(course);
	}

	public static com.yamidev.virtualclassroom.model.Course addCourse(
			long groupId, java.util.Map<java.util.Locale, String> name,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCourse(
			groupId, name, description, serviceContext);
	}

	public static int countByGroupId(long groupId) {
		return getService().countByGroupId(groupId);
	}

	public static int countByU_G(long userId, long groupId) {
		return getService().countByU_G(userId, groupId);
	}

	public static int countByUserId(long userId) {
		return getService().countByUserId(userId);
	}

	public static com.yamidev.virtualclassroom.model.Course createCourse(
		long courseId) {

		return getService().createCourse(courseId);
	}


	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static com.yamidev.virtualclassroom.model.Course deleteCourse(
		com.yamidev.virtualclassroom.model.Course course) {

		return getService().deleteCourse(course);
	}

	public static com.yamidev.virtualclassroom.model.Course deleteCourse(
			long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCourse(courseId);
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}


	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.yamidev.virtualclassroom.model.Course fetchCourse(
		long courseId) {

		return getService().fetchCourse(courseId);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		findByGroupId(long groupId) {

		return getService().findByGroupId(groupId);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		findByGroupId(long groupId, int start) {

		return getService().findByGroupId(groupId, start);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		findByU_G(long userId, long groupId) {

		return getService().findByU_G(userId, groupId);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		findByU_G(long userId, long groupId, int start, int end) {

		return getService().findByU_G(userId, groupId, start, end);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		findByUserId(long userId) {

		return getService().findByUserId(userId);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		findByUserId(long userId, int start) {

		return getService().findByUserId(userId, start);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.yamidev.virtualclassroom.model.Course getCourse(
			long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCourse(courseId);
	}

	public static java.util.List<com.yamidev.virtualclassroom.model.Course>
		getCourses(int start, int end) {

		return getService().getCourses(start, end);
	}

	public static int getCoursesCount() {
		return getService().getCoursesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}


	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}


	public static com.yamidev.virtualclassroom.model.Course updateCourse(
		com.yamidev.virtualclassroom.model.Course course) {

		return getService().updateCourse(course);
	}

	public static com.yamidev.virtualclassroom.model.Course updateCourse(
			long courseId, java.util.Map<java.util.Locale, String> name,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCourse(
			courseId, name, description, serviceContext);
	}

	public static CourseLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CourseLocalService, CourseLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CourseLocalService.class);

		ServiceTracker<CourseLocalService, CourseLocalService> serviceTracker =
			new ServiceTracker<CourseLocalService, CourseLocalService>(
				bundle.getBundleContext(), CourseLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}