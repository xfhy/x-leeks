package compontent;

import com.intellij.openapi.components.BaseComponent;
import com.intellij.openapi.progress.ProgressManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import business.XDateUtil;
import service.AlertService;
import service.ScheduledService;

/**
 * 2021年1月27日14:43:09
 *
 * @author xfhy
 * 一进入Android Studio 就会运行该组件
 */
public class StartComponent implements BaseComponent {

    public static boolean isStart = false;

    @Override
    public void initComponent() {
        System.out.println("component初始化--------");

        /*try {
            //int period = Integer.parseInt(result);
            int period = 1;
            ScheduledService.getInstance().addTask(period * 10 * 1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //1. 时间到,判断是否已到达 14:47-14:58
                    //2. 如果时间到了,则拿基金数据,如果跌了0.5以上就通知.
                    System.out.println("时间到--------");
                    if (XDateUtil.isAddingTime(TARGET_HOUR, TARGET_START_MINUTE, TARGET_END_MINUTE)) {
                        *//*ProgressManager.getInstance().executeNonCancelableSection(
                                () -> AlertService.getInstance().showAlertDialog(null, period));*//*
                    }
                }
            });
            //开始运行  只能开始依次
            System.out.println("开始运行--------");
            ScheduledService.getInstance().start();
        } catch (Exception ex) {
            //exception
            ex.printStackTrace();
        }
        isStart = true;*/

    }

}
