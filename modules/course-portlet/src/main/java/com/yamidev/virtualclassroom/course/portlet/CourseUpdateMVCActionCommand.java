package com.yamidev.virtualclassroom.course.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.yamidev.virtualclassroom.course.constants.CoursePortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + CoursePortletKeys.COURSE,
                "mvc.command.name=/course/update"
        },
        service = MVCActionCommand.class
)
public class CourseUpdateMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        String courseName = ParamUtil.getString(actionRequest, "name");
        _log.info("name of course "+courseName);
        return true;
    }

    private static final Log _log= LogFactoryUtil.getLog(CourseUpdateMVCActionCommand.class);
}
