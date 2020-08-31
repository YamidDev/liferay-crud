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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BusinessAssetLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetLocalService
 * @generated
 */
public class BusinessAssetLocalServiceWrapper
	implements BusinessAssetLocalService,
			   ServiceWrapper<BusinessAssetLocalService> {

	public BusinessAssetLocalServiceWrapper(
		BusinessAssetLocalService businessAssetLocalService) {

		_businessAssetLocalService = businessAssetLocalService;
	}

	@Override
	public com.pactia.co.active.model.BusinessAsset addAsset(
			long groupId, String assetCode, String cityId, String assetName,
			String assetAddress, double squareMeterValue,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<java.util.Locale, String> description)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.addAsset(
			groupId, assetCode, cityId, assetName, assetAddress,
			squareMeterValue, serviceContext, description);
	}

	/**
	 * Adds the business asset to the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the business asset
	 * @return the business asset that was added
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset addBusinessAsset(
		com.pactia.co.active.model.BusinessAsset businessAsset) {

		return _businessAssetLocalService.addBusinessAsset(businessAsset);
	}

	/**
	 * Creates a new business asset with the primary key. Does not add the business asset to the database.
	 *
	 * @param businessAssetId the primary key for the new business asset
	 * @return the new business asset
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset createBusinessAsset(
		long businessAssetId) {

		return _businessAssetLocalService.createBusinessAsset(businessAssetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the business asset from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the business asset
	 * @return the business asset that was removed
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset deleteBusinessAsset(
		com.pactia.co.active.model.BusinessAsset businessAsset) {

		return _businessAssetLocalService.deleteBusinessAsset(businessAsset);
	}

	/**
	 * Deletes the business asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset that was removed
	 * @throws PortalException if a business asset with the primary key could not be found
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset deleteBusinessAsset(
			long businessAssetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.deleteBusinessAsset(businessAssetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businessAssetLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _businessAssetLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _businessAssetLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _businessAssetLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _businessAssetLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _businessAssetLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.pactia.co.active.model.BusinessAsset fetchBusinessAsset(
		long businessAssetId) {

		return _businessAssetLocalService.fetchBusinessAsset(businessAssetId);
	}

	/**
	 * Returns the business asset matching the UUID and group.
	 *
	 * @param uuid the business asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset
		fetchBusinessAssetByUuidAndGroupId(String uuid, long groupId) {

		return _businessAssetLocalService.fetchBusinessAssetByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.pactia.co.active.model.BusinessAsset> findAll() {
		return _businessAssetLocalService.findAll();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _businessAssetLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the business asset with the primary key.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset
	 * @throws PortalException if a business asset with the primary key could not be found
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset getBusinessAsset(
			long businessAssetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.getBusinessAsset(businessAssetId);
	}

	/**
	 * Returns the business asset matching the UUID and group.
	 *
	 * @param uuid the business asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching business asset
	 * @throws PortalException if a matching business asset could not be found
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset
			getBusinessAssetByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.getBusinessAssetByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.pactia.co.active.model.BusinessAsset>
		getBusinessAssets(int start, int end) {

		return _businessAssetLocalService.getBusinessAssets(start, end);
	}

	/**
	 * Returns all the business assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the business assets
	 * @param companyId the primary key of the company
	 * @return the matching business assets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.pactia.co.active.model.BusinessAsset>
		getBusinessAssetsByUuidAndCompanyId(String uuid, long companyId) {

		return _businessAssetLocalService.getBusinessAssetsByUuidAndCompanyId(
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
	@Override
	public java.util.List<com.pactia.co.active.model.BusinessAsset>
		getBusinessAssetsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.pactia.co.active.model.BusinessAsset> orderByComparator) {

		return _businessAssetLocalService.getBusinessAssetsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of business assets.
	 *
	 * @return the number of business assets
	 */
	@Override
	public int getBusinessAssetsCount() {
		return _businessAssetLocalService.getBusinessAssetsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _businessAssetLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _businessAssetLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _businessAssetLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _businessAssetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the business asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param businessAsset the business asset
	 * @return the business asset that was updated
	 */
	@Override
	public com.pactia.co.active.model.BusinessAsset updateBusinessAsset(
		com.pactia.co.active.model.BusinessAsset businessAsset) {

		return _businessAssetLocalService.updateBusinessAsset(businessAsset);
	}

	@Override
	public BusinessAssetLocalService getWrappedService() {
		return _businessAssetLocalService;
	}

	@Override
	public void setWrappedService(
		BusinessAssetLocalService businessAssetLocalService) {

		_businessAssetLocalService = businessAssetLocalService;
	}

	private BusinessAssetLocalService _businessAssetLocalService;

}