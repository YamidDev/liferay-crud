package com.yamidev.virtualclassroom.course.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.yamidev.virtualclassroom.course.constants.ConstantCommand;
import com.yamidev.virtualclassroom.course.constants.CoursePortletKeys;
import com.yamidev.virtualclassroom.service.CourseService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.util.Locale;
import java.util.Map;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + CoursePortletKeys.COURSE,
                "mvc.command.name=" + ConstantCommand.UPDATE_COURSE
        },
        service = MVCActionCommand.class
)
public class CourseUpdateMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        try {
            Map<Locale, String> name = LocalizationUtil.getLocalizationMap(actionRequest, "name");
            String description = ParamUtil.getString(actionRequest, "description");

            ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
            long groupId = themeDisplay.getScopeGroupId();
            ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
            _courseService.addCourse(groupId, name, description, serviceContext);
            return true;
        }catch (Exception e) {
            _log.error(e.getMessage());
        }
        return false;
    }

    private static final Log _log= LogFactoryUtil.getLog(CourseUpdateMVCActionCommand.class);

    @Reference
    private CourseService _courseService;
}
