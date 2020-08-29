package com.yamidev.virtualclassroom.course.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.yamidev.virtualclassroom.course.constants.CoursePortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + CoursePortletKeys.COURSE,
                "mvc.command.name=edit-course"
        },
        service = MVCRenderCommand.class
)
public class CourseEditRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        return "/edit.jsp";
    }
}
