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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.pactia.co.active.exception.NoSuchBusinessAssetException;
import com.pactia.co.active.model.BusinessAsset;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the business asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BusinessAssetUtil
 * @generated
 */
@ProviderType
public interface BusinessAssetPersistence
	extends BasePersistence<BusinessAsset> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BusinessAssetUtil} to access the business asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the business assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching business assets
	 */
	public java.util.List<BusinessAsset> findByUuid(String uuid);

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
	public java.util.List<BusinessAsset> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where uuid = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public BusinessAsset[] findByUuid_PrevAndNext(
			long businessAssetId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the business assets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of business assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching business assets
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the business asset where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUUID_G(String uuid, long groupId)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the business asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the business asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the business asset where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the business asset that was removed
	 */
	public BusinessAsset removeByUUID_G(String uuid, long groupId)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the number of business assets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching business assets
	 */
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last business asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public BusinessAsset[] findByUuid_C_PrevAndNext(
			long businessAssetId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the business assets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of business assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching business assets
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the business assets where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching business assets
	 */
	public java.util.List<BusinessAsset> findByUserId(long userId);

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
	public java.util.List<BusinessAsset> findByUserId(
		long userId, int start, int end);

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
	public java.util.List<BusinessAsset> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last business asset in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where userId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public BusinessAsset[] findByUserId_PrevAndNext(
			long businessAssetId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the business assets where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of business assets where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching business assets
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching business assets
	 */
	public java.util.List<BusinessAsset> findByGroupId(long groupId);

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
	public java.util.List<BusinessAsset> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<BusinessAsset> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public BusinessAsset[] findByGroupId_PrevAndNext(
			long businessAssetId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the business assets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the business assets where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the matching business assets
	 */
	public java.util.List<BusinessAsset> findByU_G(long userId, long groupId);

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
	public java.util.List<BusinessAsset> findByU_G(
		long userId, long groupId, int start, int end);

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
	public java.util.List<BusinessAsset> findByU_G(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findByU_G(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByU_G_First(
			long userId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByU_G_First(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByU_G_Last(
			long userId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last business asset in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByU_G_Last(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public BusinessAsset[] findByU_G_PrevAndNext(
			long businessAssetId, long userId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the business assets where userId = &#63; and groupId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 */
	public void removeByU_G(long userId, long groupId);

	/**
	 * Returns the number of business assets where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public int countByU_G(long userId, long groupId);

	/**
	 * Returns all the business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching business assets
	 */
	public java.util.List<BusinessAsset> findByAll(long groupId);

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
	public java.util.List<BusinessAsset> findByAll(
		long groupId, int start, int end);

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
	public java.util.List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findByAll(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByAll_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the first business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByAll_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByAll_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the last business asset in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByAll_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

	/**
	 * Returns the business assets before and after the current business asset in the ordered set where groupId = &#63;.
	 *
	 * @param businessAssetId the primary key of the current business asset
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public BusinessAsset[] findByAll_PrevAndNext(
			long businessAssetId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
				orderByComparator)
		throws NoSuchBusinessAssetException;

	/**
	 * Removes all the business assets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByAll(long groupId);

	/**
	 * Returns the number of business assets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching business assets
	 */
	public int countByAll(long groupId);

	/**
	 * Returns the business asset where assetCode = &#63; or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param assetCode the asset code
	 * @return the matching business asset
	 * @throws NoSuchBusinessAssetException if a matching business asset could not be found
	 */
	public BusinessAsset findByAssetCode(String assetCode)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the business asset where assetCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetCode the asset code
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByAssetCode(String assetCode);

	/**
	 * Returns the business asset where assetCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetCode the asset code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching business asset, or <code>null</code> if a matching business asset could not be found
	 */
	public BusinessAsset fetchByAssetCode(
		String assetCode, boolean useFinderCache);

	/**
	 * Removes the business asset where assetCode = &#63; from the database.
	 *
	 * @param assetCode the asset code
	 * @return the business asset that was removed
	 */
	public BusinessAsset removeByAssetCode(String assetCode)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the number of business assets where assetCode = &#63;.
	 *
	 * @param assetCode the asset code
	 * @return the number of matching business assets
	 */
	public int countByAssetCode(String assetCode);

	/**
	 * Caches the business asset in the entity cache if it is enabled.
	 *
	 * @param businessAsset the business asset
	 */
	public void cacheResult(BusinessAsset businessAsset);

	/**
	 * Caches the business assets in the entity cache if it is enabled.
	 *
	 * @param businessAssets the business assets
	 */
	public void cacheResult(java.util.List<BusinessAsset> businessAssets);

	/**
	 * Creates a new business asset with the primary key. Does not add the business asset to the database.
	 *
	 * @param businessAssetId the primary key for the new business asset
	 * @return the new business asset
	 */
	public BusinessAsset create(long businessAssetId);

	/**
	 * Removes the business asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset that was removed
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public BusinessAsset remove(long businessAssetId)
		throws NoSuchBusinessAssetException;

	public BusinessAsset updateImpl(BusinessAsset businessAsset);

	/**
	 * Returns the business asset with the primary key or throws a <code>NoSuchBusinessAssetException</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset
	 * @throws NoSuchBusinessAssetException if a business asset with the primary key could not be found
	 */
	public BusinessAsset findByPrimaryKey(long businessAssetId)
		throws NoSuchBusinessAssetException;

	/**
	 * Returns the business asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businessAssetId the primary key of the business asset
	 * @return the business asset, or <code>null</code> if a business asset with the primary key could not be found
	 */
	public BusinessAsset fetchByPrimaryKey(long businessAssetId);

	/**
	 * Returns all the business assets.
	 *
	 * @return the business assets
	 */
	public java.util.List<BusinessAsset> findAll();

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
	public java.util.List<BusinessAsset> findAll(int start, int end);

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
	public java.util.List<BusinessAsset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator);

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
	public java.util.List<BusinessAsset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessAsset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the business assets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of business assets.
	 *
	 * @return the number of business assets
	 */
	public int countAll();

}