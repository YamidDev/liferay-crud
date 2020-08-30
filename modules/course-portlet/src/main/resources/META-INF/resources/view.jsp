<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ include file="/init.jsp" %>

<p>
	<liferay-portlet:renderURL var="newURL" windowState="<%= LiferayWindowState.MAXIMIZED.toString() %>">
		<liferay-portlet:param name="mvcRenderCommandName" value="<%=ConstantCommand.EDIT_COURSE %>"/>
		<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
	</liferay-portlet:renderURL>
	<aui:button value="new"  href="${ newURL }"></aui:button>
</p>