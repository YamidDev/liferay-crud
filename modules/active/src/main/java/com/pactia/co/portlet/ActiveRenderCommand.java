package com.pactia.co.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.pactia.co.constants.ActivePortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
@Component(
        immediate = true,
        property = {

                "javax.portlet.name=" + ActivePortletKeys.ACTIVE,
                "mvc.command.name=edit-active"
        },
        service = MVCRenderCommand.class
)
public class ActiveRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        return "/edit.jsp";
    }
}
