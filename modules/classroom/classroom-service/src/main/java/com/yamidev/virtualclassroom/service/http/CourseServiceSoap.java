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

package com.yamidev.virtualclassroom.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;

import com.yamidev.virtualclassroom.service.CourseServiceUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * <code>CourseServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.yamidev.virtualclassroom.model.CourseSoap</code>. If the method in the
 * service utility returns a
 * <code>com.yamidev.virtualclassroom.model.Course</code>, that is translated to a
 * <code>com.yamidev.virtualclassroom.model.CourseSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseServiceHttp
 * @generated
 */
public class CourseServiceSoap {

	public static com.yamidev.virtualclassroom.model.CourseSoap addCourse(
			long groupId, String[] nameLanguageIds, String[] nameValues,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> name = LocalizationUtil.getLocalizationMap(
				nameLanguageIds, nameValues);

			com.yamidev.virtualclassroom.model.Course returnValue =
				CourseServiceUtil.addCourse(
					groupId, name, description, serviceContext);

			return com.yamidev.virtualclassroom.model.CourseSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.yamidev.virtualclassroom.model.CourseSoap[] findByGroupId(
			long groupId)
		throws RemoteException {

		try {
			java.util.List<com.yamidev.virtualclassroom.model.Course>
				returnValue = CourseServiceUtil.findByGroupId(groupId);

			return com.yamidev.virtualclassroom.model.CourseSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CourseServiceSoap.class);

}