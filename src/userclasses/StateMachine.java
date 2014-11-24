/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import java.util.Hashtable;


/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }


    @Override
    protected void onMain_AddButtonAction(Component c, ActionEvent event) {
        String todo = findToDoItem().getText();
        String desc = findDescription().getText();
        Hashtable h = new Hashtable();
        h.put("Line1",todo);
        h.put("Line2", desc);
        findToDoList().getModel().addItem(h);
        findToDoItem().setText("");
        findDescription().setText("");

    }
}
