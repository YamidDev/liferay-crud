package com.yamidev.virtualclassroom.service;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.yamidev.virtualclassroom.model.Course;
import org.osgi.annotation.versioning.ProviderType;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CourseLocalService
	extends BaseLocalService, PersistedModelLocalService {

	@Indexable(type = IndexableType.REINDEX)
	public Course addCourse(Course course);

	public Course addCourse(
			long groupId, Map<Locale, String> name, String description,
			ServiceContext serviceContext)
		throws PortalException;

	public int countByGroupId(long groupId);

	public int countByU_G(long userId, long groupId);

	public int countByUserId(long userId);

	@Transactional(enabled = false)
	public Course createCourse(long courseId);

	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public Course deleteCourse(Course course);

	@Indexable(type = IndexableType.DELETE)
	public Course deleteCourse(long courseId) throws PortalException;

	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();


	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);


	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);


	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Course fetchCourse(long courseId);

	public List<Course> findByGroupId(long groupId);

	public List<Course> findByGroupId(long groupId, int start);

	public List<Course> findByU_G(long userId, long groupId);

	public List<Course> findByU_G(
		long userId, long groupId, int start, int end);

	public List<Course> findByUserId(long userId);

	public List<Course> findByUserId(long userId, int start);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Course getCourse(long courseId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Course> getCourses(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCoursesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Course updateCourse(Course course);

	public Course updateCourse(
			long courseId, Map<Locale, String> name, String description,
			ServiceContext serviceContext)
		throws PortalException;

}