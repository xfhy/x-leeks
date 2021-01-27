package compontent;

import com.intellij.openapi.components.BaseComponent;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.event.EditorEventMulticaster;

public class SampleDialogWrapper implements BaseComponent {

    @Override
    public void initComponent() {
        System.out.println("component初始化--------");

    }

}
