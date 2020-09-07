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

package com.pactia.co.active.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.pactia.co.active.model.BusinessAsset;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the business asset service. This utility wraps <code>com.pactia.co.active.service.persistence.impl.BusinessAssetPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetPersistence
 * @generated
 */
public class BusinessAssetUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(BusinessAsset businessAsset) {
		getPersistence().clearCache(businessAsset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, BusinessAsset> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BusinessAsset> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BusinessAsset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BusinessAsset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BusinessAsset update(BusinessAsset businessAsset) {
		return getPersistence().update(businessAsset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BusinessAsset update(
		BusinessAsset businessAsset, ServiceContext serviceContext) {

		return getPersistence().update(businessAsset, serviceContext);
	}

	/**
	 * Returns all the business assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching business assets
	 */
	public static List<BusinessAsset> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the business assets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of matching business assets
	 */
	public static List<BusinessAsset> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the business assets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUuid_First(
			String uuid, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUuid_First(
		String uuid, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUuid_Last(
			String uuid, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUuid_Last(
		String uuid, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where uuid = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset[] findByUuid_PrevAndNext(
			long businessAssetId, String uuid,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUuid_PrevAndNext(
			businessAssetId, uuid, orderByComparator);
	}

	/**
	 * Removes all the business assets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of business assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching business assets
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the business asset where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUUID_G(String uuid, long groupId)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the business asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the business asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the business asset where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the business asset that was removed
	 */
	public static BusinessAsset removeByUUID_G(String uuid, long groupId)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of business assets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching business assets
	 */
	public static List<BusinessAsset> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of matching business assets
	 */
	public static List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset[] findByUuid_C_PrevAndNext(
			long businessAssetId, String uuid, long companyId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUuid_C_PrevAndNext(
			businessAssetId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the business assets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching business assets
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the business assets where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching business assets
	 */
	public static List<BusinessAsset> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the business assets where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of matching business assets
	 */
	public static List<BusinessAsset> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the business assets where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByUserId(
		long userId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByUserId(
		long userId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUserId_First(
			long userId, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUserId_First(
		long userId, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByUserId_Last(
			long userId, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByUserId_Last(
		long userId, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where userId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset[] findByUserId_PrevAndNext(
			long businessAssetId, long userId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByUserId_PrevAndNext(
			businessAssetId, userId, orderByComparator);
	}

	/**
	 * Removes all the business assets where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of business assets where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching business assets
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching business assets
	 */
	public static List<BusinessAsset> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the business assets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of matching business assets
	 */
	public static List<BusinessAsset> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the business assets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByGroupId_First(
			long groupId, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByGroupId_First(
		long groupId, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByGroupId_Last(
			long groupId, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByGroupId_Last(
		long groupId, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset[] findByGroupId_PrevAndNext(
			long businessAssetId, long groupId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByGroupId_PrevAndNext(
			businessAssetId, groupId, orderByComparator);
	}

	/**
	 * Removes all the business assets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the business assets where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the matching business assets
	 */
	public static List<BusinessAsset> findByU_G(long userId, long groupId) {
		return getPersistence().findByU_G(userId, groupId);
	}

	/**
	 * Returns a range of all the business assets where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of matching business assets
	 */
	public static List<BusinessAsset> findByU_G(
		long userId, long groupId, int start, int end) {

		return getPersistence().findByU_G(userId, groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the business assets where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByU_G(
		long userId, long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findByU_G(
			userId, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByU_G(
		long userId, long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByU_G(
			userId, groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByU_G_First(
			long userId, long groupId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByU_G_First(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the first business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByU_G_First(
		long userId, long groupId,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByU_G_First(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByU_G_Last(
			long userId, long groupId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByU_G_Last(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByU_G_Last(
		long userId, long groupId,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByU_G_Last(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset[] findByU_G_PrevAndNext(
			long businessAssetId, long userId, long groupId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByU_G_PrevAndNext(
			businessAssetId, userId, groupId, orderByComparator);
	}

	/**
	 * Removes all the business assets where userId = &#63; and groupId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 */
	public static void removeByU_G(long userId, long groupId) {
		getPersistence().removeByU_G(userId, groupId);
	}

	/**
	 * Returns the number of business assets where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public static int countByU_G(long userId, long groupId) {
		return getPersistence().countByU_G(userId, groupId);
	}

	/**
	 * Returns all the business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching business assets
	 */
	public static List<BusinessAsset> findByAll(long groupId) {
		return getPersistence().findByAll(groupId);
	}

	/**
	 * Returns a range of all the business assets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of matching business assets
	 */
	public static List<BusinessAsset> findByAll(
		long groupId, int start, int end) {

		return getPersistence().findByAll(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the business assets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findByAll(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching business assets
	 */
	public static List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAll(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByAll_First(
			long groupId, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByAll_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByAll_First(
		long groupId, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByAll_First(groupId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByAll_Last(
			long groupId, OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByAll_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByAll_Last(
		long groupId, OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().fetchByAll_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset[] findByAll_PrevAndNext(
			long businessAssetId, long groupId,
			OrderByComparator<BusinessAsset> orderByComparator)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByAll_PrevAndNext(
			businessAssetId, groupId, orderByComparator);
	}

	/**
	 * Removes all the business assets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByAll(long groupId) {
		getPersistence().removeByAll(groupId);
	}

	/**
	 * Returns the number of business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public static int countByAll(long groupId) {
		return getPersistence().countByAll(groupId);
	}

	/**
	 * Returns the business asset where assetCode = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param assetCode the asset code
	 * @return the matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public static BusinessAsset findByAssetCode(String assetCode)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByAssetCode(assetCode);
	}

	/**
	 * Returns the business asset where assetCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetCode the asset code
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByAssetCode(String assetCode) {
		return getPersistence().fetchByAssetCode(assetCode);
	}

	/**
	 * Returns the business asset where assetCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetCode the asset code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public static BusinessAsset fetchByAssetCode(
		String assetCode, boolean useFinderCache) {

		return getPersistence().fetchByAssetCode(assetCode, useFinderCache);
	}

	/**
	 * Removes the business asset where assetCode = &#63; from the database.
	 *
	 * @param assetCode the asset code
	 * @return the business asset that was removed
	 */
	public static BusinessAsset removeByAssetCode(String assetCode)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().removeByAssetCode(assetCode);
	}

	/**
	 * Returns the number of business assets where assetCode = &#63;.
	 *
	 * @param assetCode the asset code
	 * @return the number of matching business assets
	 */
	public static int countByAssetCode(String assetCode) {
		return getPersistence().countByAssetCode(assetCode);
	}

	/**
	 * Caches the business asset in the entity cache if it is enabled.
	 *
	 * @param businessAsset the business asset
	 */
	public static void cacheResult(BusinessAsset businessAsset) {
		getPersistence().cacheResult(businessAsset);
	}

	/**
	 * Caches the business assets in the entity cache if it is enabled.
	 *
	 * @param businessAssets the business assets
	 */
	public static void cacheResult(List<BusinessAsset> businessAssets) {
		getPersistence().cacheResult(businessAssets);
	}

	/**
	 * Creates a new business asset with the primary key. Does not add the business asset to the database.
	 *
	 * @param businessAssetId the primary key for the new business asset
	 * @return the new business asset
	 */
	public static BusinessAsset create(long businessAssetId) {
		return getPersistence().create(businessAssetId);
	}

	/**
	 * Removes the business asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset that was removed
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset remove(long businessAssetId)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().remove(businessAssetId);
	}

	public static BusinessAsset updateImpl(BusinessAsset businessAsset) {
		return getPersistence().updateImpl(businessAsset);
	}

	/**
	 * Returns the business asset with the primary key or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public static BusinessAsset findByPrimaryKey(long businessAssetId)
		throws com.pactia.co.active.exception.NoSuchBusinessAssetException {

		return getPersistence().findByPrimaryKey(businessAssetId);
	}

	/**
	 * Returns the business asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset, or <code>null</code> if a business asset with the primary key could not be found
	 */
	public static BusinessAsset fetchByPrimaryKey(long businessAssetId) {
		return getPersistence().fetchByPrimaryKey(businessAssetId);
	}

	/**
	 * Returns all the business assets.
	 *
	 * @return the business assets
	 */
	public static List<BusinessAsset> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the business assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @return the range of business assets
	 */
	public static List<BusinessAsset> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the business assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of business assets
	 */
	public static List<BusinessAsset> findAll(
		int start, int end,
		OrderByComparator<BusinessAsset> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the business assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BusinessAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of business assets
	 * @param end the upper bound of the range of business assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of business assets
	 */
	public static List<BusinessAsset> findAll(
		int start, int end, OrderByComparator<BusinessAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the business assets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of business assets.
	 *
	 * @return the number of business assets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BusinessAssetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<BusinessAssetPersistence, BusinessAssetPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BusinessAssetPersistence.class);

		ServiceTracker<BusinessAssetPersistence, BusinessAssetPersistence>
			serviceTracker =
				new ServiceTracker
					<BusinessAssetPersistence, BusinessAssetPersistence>(
						bundle.getBundleContext(),
						BusinessAssetPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}