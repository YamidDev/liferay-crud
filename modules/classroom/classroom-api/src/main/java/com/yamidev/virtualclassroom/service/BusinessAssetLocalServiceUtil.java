/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.yamidev.virtualclassroom.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for BusinessAsset. This utility wraps
 * <code>com.yamidev.virtualclassroom.service.impl.BusinessAssetLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetLocalService
 * @generated
 */
public class BusinessAssetLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.yamidev.virtualclassroom.service.impl.BusinessAssetLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the Activos del negocio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the Activos del negocio
	 * @return the Activos del negocio that was added
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
		addBusinessAsset(
			com.yamidev.virtualclassroom.model.BusinessAsset businessAsset) {

		return getService().addBusinessAsset(businessAsset);
	}

	/**
	 * Creates a new Activos del negocio with the primary key. Does not add the Activos del negocio to the database.
	 *
	 * @param businessAssetId the primary key for the new Activos del negocio
	 * @return the new Activos del negocio
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
		createBusinessAsset(long businessAssetId) {

		return getService().createBusinessAsset(businessAssetId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the Activos del negocio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the Activos del negocio
	 * @return the Activos del negocio that was removed
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
		deleteBusinessAsset(
			com.yamidev.virtualclassroom.model.BusinessAsset businessAsset) {

		return getService().deleteBusinessAsset(businessAsset);
	}

	/**
	 * Deletes the Activos del negocio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio that was removed
	 * @throws PortalException if a Activos del negocio with the primary key could not be found
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
			deleteBusinessAsset(long businessAssetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteBusinessAsset(businessAssetId);
	}

	/**
	 * @throws PortalException
	 */
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

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.yamidev.virtualclassroom.model.impl.BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.yamidev.virtualclassroom.model.impl.BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.yamidev.virtualclassroom.model.BusinessAsset
		fetchBusinessAsset(long businessAssetId) {

		return getService().fetchBusinessAsset(businessAssetId);
	}

	/**
	 * Returns the Activos del negocio matching the UUID and group.
	 *
	 * @param uuid the Activos del negocio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Activos del negocio, or <code>null</code> if a matching Activos del negocio could not be found
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
		fetchBusinessAssetByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchBusinessAssetByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the Activos del negocio with the primary key.
	 *
	 * @param businessAssetId the primary key of the Activos del negocio
	 * @return the Activos del negocio
	 * @throws PortalException if a Activos del negocio with the primary key could not be found
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
			getBusinessAsset(long businessAssetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBusinessAsset(businessAssetId);
	}

	/**
	 * Returns the Activos del negocio matching the UUID and group.
	 *
	 * @param uuid the Activos del negocio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Activos del negocio
	 * @throws PortalException if a matching Activos del negocio could not be found
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
			getBusinessAssetByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBusinessAssetByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the Activos del negocios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.yamidev.virtualclassroom.model.impl.BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @return the range of Activos del negocios
	 */
	public static java.util.List
		<com.yamidev.virtualclassroom.model.BusinessAsset> getBusinessAssets(
			int start, int end) {

		return getService().getBusinessAssets(start, end);
	}

	/**
	 * Returns all the Activos del negocios matching the UUID and company.
	 *
	 * @param uuid the UUID of the Activos del negocios
	 * @param companyId the primary key of the company
	 * @return the matching Activos del negocios, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.yamidev.virtualclassroom.model.BusinessAsset>
			getBusinessAssetsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getBusinessAssetsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of Activos del negocios matching the UUID and company.
	 *
	 * @param uuid the UUID of the Activos del negocios
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of Activos del negocios
	 * @param end the upper bound of the range of Activos del negocios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching Activos del negocios, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.yamidev.virtualclassroom.model.BusinessAsset>
			getBusinessAssetsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.yamidev.virtualclassroom.model.BusinessAsset>
						orderByComparator) {

		return getService().getBusinessAssetsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of Activos del negocios.
	 *
	 * @return the number of Activos del negocios
	 */
	public static int getBusinessAssetsCount() {
		return getService().getBusinessAssetsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the Activos del negocio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the Activos del negocio
	 * @return the Activos del negocio that was updated
	 */
	public static com.yamidev.virtualclassroom.model.BusinessAsset
		updateBusinessAsset(
			com.yamidev.virtualclassroom.model.BusinessAsset businessAsset) {

		return getService().updateBusinessAsset(businessAsset);
	}

	public static BusinessAssetLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<BusinessAssetLocalService, BusinessAssetLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			BusinessAssetLocalService.class);

		ServiceTracker<BusinessAssetLocalService, BusinessAssetLocalService>
			serviceTracker =
				new ServiceTracker
					<BusinessAssetLocalService, BusinessAssetLocalService>(
						bundle.getBundleContext(),
						BusinessAssetLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}