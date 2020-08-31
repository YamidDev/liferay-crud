package com.pactia.co.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.pactia.co.constants.ActivePortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {

                "javax.portlet.name=" + ActivePortletKeys.ACTIVE,
                "mvc.command.name=/active/update"
        },
        service = MVCActionCommand.class
)
public class ActiveUpdateMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        String activeName= ParamUtil.getString(actionRequest, "name");
        _log.info("Nombre del activo "+ activeName);
        return true;
    }

    private static final Log _log= LogFactoryUtil.getLog(ActiveUpdateMVCActionCommand.class);
}
