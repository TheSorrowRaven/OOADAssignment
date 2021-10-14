package src.Admin;

import src.*;
import src.Users.*;

public class AdminGUIWindow extends MenuGUIWindow {


    public AdminController admin;

    public AdminGUIWindow(AdminUser adminUser) {
        super(Resource().admin_theme);
        admin = new AdminController(adminUser);
    }

    @Override
    public String getWindowTitle() {
        return Resource().admin_window_title;
    }



    @Override
    protected MenuBarGUIPanel getMenuBarContentPanel() {
        return new AdminBarGUIPanel(this);
    }

    @Override
    protected MenuContentGUIPanel getContentGUIPanel() {
        return new AdminGUIPanel(this);
    }

    
    @Override
    public void onCreate() {
        setSize(Resource().menu_window_width, Resource().menu_window_height);
    }

    @Override
    public void onView() {
        setVisible(true);
    }

    @Override
    public void onPreparingToSwitch() {
        
    }

    @Override
    public void onSwitchedOff() {
        
    }

    @Override
    public void onSwitchedIn() {
        
    }

    @Override
    public void onDestroy() {
        
    }
    
}
