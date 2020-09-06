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

package com.pactia.co.active.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for BusinessAsset. This utility wraps
 * <code>com.pactia.co.active.service.impl.BusinessAssetLocalServiceImpl</code> and
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
	 * Never modify this class directly. Add custom service methods to <code>com.pactia.co.active.service.impl.BusinessAssetLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.pactia.co.active.model.BusinessAsset addAsset(
			long groupId, String assetCode, String cityId, String assetName,
			String assetAddress, double squareMeterValue,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<java.util.Locale, String> description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addAsset(
			groupId, assetCode, cityId, assetName, assetAddress,
			squareMeterValue, serviceContext, description);
	}

	/**
	 * Adds the business asset to the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the business asset
	 * @return the business asset that was added
	 */
	public static com.pactia.co.active.model.BusinessAsset addBusinessAsset(
		com.pactia.co.active.model.BusinessAsset businessAsset) {

		return getService().addBusinessAsset(businessAsset);
	}

	/**
	 * Creates a new business asset with the primary key. Does not add the business asset to the database.
	 *
	 * @param businessAssetId the primary key for the new business asset
	 * @return the new business asset
	 */
	public static com.pactia.co.active.model.BusinessAsset createBusinessAsset(
		long businessAssetId) {

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
	 * Deletes the business asset from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the business asset
	 * @return the business asset that was removed
	 */
	public static com.pactia.co.active.model.BusinessAsset deleteBusinessAsset(
		com.pactia.co.active.model.BusinessAsset businessAsset) {

		return getService().deleteBusinessAsset(businessAsset);
	}

	/**
	 * Deletes the business asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset that was removed
	 * @throws PortalException if a business asset with the primary key could not be found
	 */
	public static com.pactia.co.active.model.BusinessAsset deleteBusinessAsset(
			long businessAssetId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pactia.co.active.model.impl.BusinessAssetModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pactia.co.active.model.impl.BusinessAssetModelImpl</code>.
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

	public static com.pactia.co.active.model.BusinessAsset fetchBusinessAsset(
		long businessAssetId) {

		return getService().fetchBusinessAsset(businessAssetId);
	}

	/**
	 * Returns the business asset matching the UUID and group.
	 *
	 * @param uuid the business asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static com.pactia.co.active.model.BusinessAsset
		fetchBusinessAssetByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchBusinessAssetByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<com.pactia.co.active.model.BusinessAsset>
		findAll() {

		return getService().findAll();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the business asset with the primary key.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset
	 * @throws PortalException if a business asset with the primary key could not be found
	 */
	public static com.pactia.co.active.model.BusinessAsset getBusinessAsset(
			long businessAssetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBusinessAsset(businessAssetId);
	}

	/**
	 * Returns the business asset matching the UUID and group.
	 *
	 * @param uuid the business asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching business asset
	 * @throws PortalException if a matching business asset could not be found
	 */
	public static com.pactia.co.active.model.BusinessAsset
			getBusinessAssetByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBusinessAssetByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the business assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pactia.co.active.model.impl.BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of business assets
	 */
	public static java.util.List<com.pactia.co.active.model.BusinessAsset>
		getBusinessAssets(int start, int end) {

		return getService().getBusinessAssets(start, end);
	}

	/**
	 * Returns all the business assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the business assets
	 * @param companyId the primary key of the company
	 * @return the matching business assets, or an empty list if no matches were found
	 */
	public static java.util.List<com.pactia.co.active.model.BusinessAsset>
		getBusinessAssetsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getBusinessAssetsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of business assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the business assets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching business assets, or an empty list if no matches were found
	 */
	public static java.util.List<com.pactia.co.active.model.BusinessAsset>
		getBusinessAssetsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.pactia.co.active.model.BusinessAsset> orderByComparator) {

		return getService().getBusinessAssetsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of business assets.
	 *
	 * @return the number of business assets
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

	public static com.pactia.co.active.model.BusinessAsset updateBusiness(
			long businessAssetId, long groupId, String assetCode, String cityId,
			String assetName, String assetAddress, double squareMeterValue,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<java.util.Locale, String> description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateBusiness(
			businessAssetId, groupId, assetCode, cityId, assetName,
			assetAddress, squareMeterValue, serviceContext, description);
	}

	/**
	 * Updates the business asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the business asset
	 * @return the business asset that was updated
	 */
	public static com.pactia.co.active.model.BusinessAsset updateBusinessAsset(
		com.pactia.co.active.model.BusinessAsset businessAsset) {

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