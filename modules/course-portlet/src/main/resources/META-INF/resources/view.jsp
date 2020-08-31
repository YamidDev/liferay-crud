<%@page import="java.util.List" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ include file="/init.jsp" %>

<% List<Course> courses = (List<Course>)renderRequest.getAttribute("courses"); %>

<p>
	<liferay-portlet:renderURL var="newURL" windowState="<%= LiferayWindowState.MAXIMIZED.toString() %>">
		<liferay-portlet:param name="mvcRenderCommandName" value="<%=ConstantCommand.EDIT_COURSE %>"/>
		<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
	</liferay-portlet:renderURL>
	<aui:button value="new"  href="${ newURL }"></aui:button>

	<tablle>
	    <thead>
	        <tr>
	            <th>Nombre</th>
	            <th>Descripcion</th>
	            <th>-</th>
	        </tr>
	    </thead>
	    <tbody>
            <%for(Course course:courses){ %>
                <tr>
                    <td><%= course.getName(locale) %></td>
                    <td><%= course.getDescription() %></td>
                    <td>

                    <td>
                </tr>
            <%} %>
	    </tbody>
	</table>
</p>